package me;

import id.AbstractC3557B;
import ve.AbstractC6034c;

/* renamed from: me.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4631d extends T {

    /* renamed from: Z  reason: collision with root package name */
    public final String f39195Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4631d(AbstractC6034c abstractC6034c, String str) {
        super(abstractC6034c, str);
        AbstractC3557B.c0("response", abstractC6034c);
        AbstractC3557B.c0("cachedResponseText", str);
        this.f39195Z = "Client request(" + abstractC6034c.b().c().getMethod().f49817a + ' ' + abstractC6034c.b().c().O() + ") invalid: " + abstractC6034c.f() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f39195Z;
    }
}
