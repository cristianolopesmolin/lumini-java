package br.com.lumini.avaliacao.service;

import java.util.Date;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.lumini.avaliacao.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	private static final String SECRET = "AquiTeriaAChaveParaGeracaoDoToken";
	
	public String generateToken(Authentication authentication) {
		User user = (User) authentication.getPrincipal();
		Date today = new Date();
		Date expireDate = new Date(today.getTime() + 86400000);
		
		return Jwts.builder()
				.setIssuer("Lumini")
				.setSubject(user.getId().toString())
				.setIssuedAt(today)
				.setExpiration(expireDate)
				.signWith(SignatureAlgorithm.HS256, SECRET.getBytes())
				.compact();
	}
	
	public boolean isValid(String token) {
		try {
			Jwts.parser().setSigningKey(SECRET.getBytes()).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Long getUserId(String token) {
		Claims claims = Jwts.parser().setSigningKey(SECRET.getBytes()).parseClaimsJws(token).getBody();
		return Long.parseLong(claims.getSubject());
	}
	
}
