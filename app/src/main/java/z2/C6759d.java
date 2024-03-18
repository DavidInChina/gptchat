package z2;

import y2.C6520g;

/* renamed from: z2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6759d implements s2.m {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51501Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6520g f51502Z;

    public /* synthetic */ C6759d(C6757b c6757b, C6520g c6520g, int i10) {
        this.f51501Y = i10;
        this.f51502Z = c6520g;
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
        switch (this.f51501Y) {
            case 0:
                C6752A c6752a = (C6752A) abstractC6758c;
                int i10 = c6752a.f51485x;
                C6520g c6520g = this.f51502Z;
                c6752a.f51485x = i10 + c6520g.f50595g;
                c6752a.f51486y += c6520g.f50593e;
                return;
            case 1:
                abstractC6758c.getClass();
                return;
            case 2:
                abstractC6758c.getClass();
                return;
            default:
                abstractC6758c.getClass();
                return;
        }
    }
}
