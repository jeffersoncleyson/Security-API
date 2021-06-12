package br.com.sensedia.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(info = @Info(title = "Security App",
        description = "Proof of Concept - Security Spring + Redis Cache + OpenAPI", version = "v1"))
@SecurityScheme(name = "security_auth", type = SecuritySchemeType.OAUTH2,
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                authorizationUrl = "${springdoc.oAuthFlow.authorizationUrl}"
                , tokenUrl = "${springdoc.oAuthFlow.tokenUrl}")))
public class OpenApiConfig {}