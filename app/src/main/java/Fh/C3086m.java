package fh;

import id.AbstractC3557B;

/* renamed from: fh.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3086m extends C3085l {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3086m(C3058A c3058a, boolean z10) {
        super(c3058a);
        AbstractC3557B.c0("writer", c3058a);
        this.f30885c = z10;
    }

    @Override // fh.C3085l
    public final void j(String str) {
        AbstractC3557B.c0("value", str);
        if (this.f30885c) {
            super.j(str);
        } else {
            h(str);
        }
    }
}
