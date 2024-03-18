package xg;

import Mf.V;
import fg.C3042j;
import fg.EnumC3041i;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import hg.C3430i;
import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;

/* renamed from: xg.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6445B extends D {

    /* renamed from: d  reason: collision with root package name */
    public final C3042j f49961d;

    /* renamed from: e  reason: collision with root package name */
    public final C6445B f49962e;

    /* renamed from: f  reason: collision with root package name */
    public final C4290b f49963f;

    /* renamed from: g  reason: collision with root package name */
    public final EnumC3041i f49964g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f49965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6445B(C3042j c3042j, AbstractC3428g abstractC3428g, C3430i c3430i, V v10, C6445B c6445b) {
        super(abstractC3428g, c3430i, v10);
        AbstractC3557B.c0("classProto", c3042j);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        this.f49961d = c3042j;
        this.f49962e = c6445b;
        this.f49963f = R4.b.f1(abstractC3428g, c3042j.f30651j0);
        EnumC3041i enumC3041i = (EnumC3041i) AbstractC3427f.f32317f.c(c3042j.f30650i0);
        this.f49964g = enumC3041i == null ? EnumC3041i.CLASS : enumC3041i;
        this.f49965h = AbstractC3427f.f32318g.c(c3042j.f30650i0).booleanValue();
    }

    @Override // xg.D
    public final C4291c a() {
        C4291c b10 = this.f49963f.b();
        AbstractC3557B.b0("asSingleFqName(...)", b10);
        return b10;
    }
}
