package v1;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: v1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5960b {

    /* renamed from: a  reason: collision with root package name */
    public final Signature f47030a;

    /* renamed from: b  reason: collision with root package name */
    public final Cipher f47031b;

    /* renamed from: c  reason: collision with root package name */
    public final Mac f47032c;

    public C5960b(Signature signature) {
        this.f47030a = signature;
        this.f47031b = null;
        this.f47032c = null;
    }

    public C5960b(Cipher cipher) {
        this.f47031b = cipher;
        this.f47030a = null;
        this.f47032c = null;
    }

    public C5960b(Mac mac) {
        this.f47032c = mac;
        this.f47031b = null;
        this.f47030a = null;
    }
}
