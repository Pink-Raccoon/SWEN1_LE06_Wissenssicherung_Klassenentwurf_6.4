package ch.zhaw.soe.swen1.le06.forum.domain;

public interface AcessTokenValidationService {
public boolean isValidToken(byte[] acessToken);
}
