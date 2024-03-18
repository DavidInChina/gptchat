package com.auth0.android.result;

import J8.b;
import R.a;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R.\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001b"}, d2 = {"Lcom/auth0/android/result/Credentials;", "", "", "idToken", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "accessToken", "a", "type", "f", "refreshToken", "d", "Ljava/util/Date;", "expiresAt", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "scope", "e", "<set-?>", "recoveryCode", "getRecoveryCode", "g", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "auth0_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class Credentials {
    @b("access_token")
    private final String accessToken;
    @b("expires_at")
    private final Date expiresAt;
    @b("id_token")
    private final String idToken;
    @b("recovery_code")
    private String recoveryCode;
    @b("refresh_token")
    private final String refreshToken;
    @b("scope")
    private final String scope;
    @b("token_type")
    private final String type;

    public Credentials(String str, String str2, String str3, String str4, Date date, String str5) {
        AbstractC3557B.c0("idToken", str);
        AbstractC3557B.c0("accessToken", str2);
        AbstractC3557B.c0("type", str3);
        AbstractC3557B.c0("expiresAt", date);
        this.idToken = str;
        this.accessToken = str2;
        this.type = str3;
        this.refreshToken = str4;
        this.expiresAt = date;
        this.scope = str5;
    }

    public final String a() {
        return this.accessToken;
    }

    public final Date b() {
        return this.expiresAt;
    }

    public final String c() {
        return this.idToken;
    }

    public final String d() {
        return this.refreshToken;
    }

    public final String e() {
        return this.scope;
    }

    public final String f() {
        return this.type;
    }

    public final void g(String str) {
        this.recoveryCode = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Credentials(idToken='xxxxx', accessToken='xxxxx', type='");
        sb2.append(this.type);
        sb2.append("', refreshToken='xxxxx', expiresAt='");
        sb2.append(this.expiresAt);
        sb2.append("', scope='");
        return a.t(sb2, this.scope, "')");
    }
}
