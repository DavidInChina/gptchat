package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes.dex */
public final class l extends Authenticator {

    /* renamed from: a  reason: collision with root package name */
    public final String f34750a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34751b;

    public l(String str, String str2) {
        this.f34750a = str;
        this.f34751b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f34750a, this.f34751b.toCharArray());
        }
        return null;
    }
}
