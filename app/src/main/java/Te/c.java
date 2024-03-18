package Te;

import We.C;
import Xe.A;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: b  reason: collision with root package name */
    public final C f17186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C c10, A a5, String str) {
        super(c10);
        AbstractC3557B.c0("participant", c10);
        AbstractC3557B.c0("sid", str);
        this.f17186b = c10;
    }

    @Override // Te.m
    public final We.w X() {
        return this.f17186b;
    }

    public c(C c10, byte[] bArr) {
        super(c10);
        this.f17186b = c10;
    }
}
