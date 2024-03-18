package yh;

import th.EnumC5807o;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class O0 extends Enum implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public static final O0 f50961Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ O0[] f50962Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, yh.O0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f50961Y = r12;
        f50962Z = new O0[]{r12};
    }

    public static O0 valueOf(String str) {
        return (O0) Enum.valueOf(O0.class, str);
    }

    public static O0[] values() {
        return (O0[]) f50962Z.clone();
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        return new C6627n0((l1.a) aVar.mo119g().k(this), EnumC5807o.f46228Y);
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        l1.a aVar2;
        l1.a ownerType = aVar.getOwnerType();
        l1 l02 = aVar.l0();
        if (ownerType == null) {
            l1.a aVar3 = l1.a.f51045N;
            aVar2 = null;
        } else {
            aVar2 = (l1.a) ownerType.k(this);
        }
        return new C6648y0(l02, aVar2, aVar.y0().k(this), EnumC5807o.f46228Y);
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        return new L0(aVar.getUpperBounds().k(this), aVar.getLowerBounds().k(this), EnumC5807o.f46228Y);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return new N0(aVar);
    }

    /* renamed from: f */
    public final l1.a b(l1.a aVar) {
        boolean T02 = aVar.T0();
        EnumC5807o enumC5807o = EnumC5807o.f46228Y;
        if (T02) {
            return new C6627n0(b(aVar.mo119g()), enumC5807o);
        }
        return new C6636s0(aVar.l0(), enumC5807o);
    }
}
