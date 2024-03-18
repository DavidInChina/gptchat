package me;

import id.AbstractC3557B;
import ve.AbstractC6034c;

/* loaded from: classes2.dex */
public final class S extends T {

    /* renamed from: Z  reason: collision with root package name */
    public final String f39188Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC6034c abstractC6034c, String str, int i10) {
        super(abstractC6034c, str);
        if (i10 != 1) {
            AbstractC3557B.c0("response", abstractC6034c);
            AbstractC3557B.c0("cachedResponseText", str);
            this.f39188Z = "Unhandled redirect: " + abstractC6034c.b().c().getMethod().f49817a + ' ' + abstractC6034c.b().c().O() + ". Status: " + abstractC6034c.f() + ". Text: \"" + str + '\"';
            return;
        }
        AbstractC3557B.c0("response", abstractC6034c);
        AbstractC3557B.c0("cachedResponseText", str);
        super(abstractC6034c, str);
        this.f39188Z = "Server error(" + abstractC6034c.b().c().getMethod().f49817a + ' ' + abstractC6034c.b().c().O() + ": " + abstractC6034c.f() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f39188Z;
    }
}
