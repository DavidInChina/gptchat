package yh;

import Qh.AbstractC1239q;
import java.util.HashSet;
import th.AbstractC5793a;
import th.AbstractC5802j;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: yh.i1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6617i1 extends Enum implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6617i1 f51014Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC6617i1[] f51015Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, yh.i1] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f51014Y = r12;
        f51015Z = new EnumC6617i1[]{r12};
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(l1.a aVar) {
        HashSet hashSet = new HashSet();
        for (AbstractC5802j abstractC5802j : aVar.getDeclaredAnnotations()) {
            AbstractC5793a abstractC5793a = (AbstractC5793a) abstractC5802j;
            if (!abstractC5793a.f("TYPE_USE") || !hashSet.add(abstractC5793a.d())) {
                return false;
            }
            while (r3.hasNext()) {
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(l1.a aVar) {
        HashSet hashSet = new HashSet();
        for (AbstractC5802j abstractC5802j : aVar.getDeclaredAnnotations()) {
            AbstractC5793a abstractC5793a = (AbstractC5793a) abstractC5802j;
            if (!abstractC5793a.f("TYPE_PARAMETER") || !hashSet.add(abstractC5793a.d())) {
                return false;
            }
            while (r3.hasNext()) {
            }
        }
        return true;
    }

    public static EnumC6617i1 valueOf(String str) {
        return (EnumC6617i1) Enum.valueOf(EnumC6617i1.class, str);
    }

    public static EnumC6617i1[] values() {
        return (EnumC6617i1[]) f51015Z.clone();
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        boolean z10;
        if (f(aVar) && ((Boolean) aVar.mo119g().k(this)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        boolean z10;
        if (f(aVar) && (!aVar.T0() || ((Boolean) aVar.mo119g().k(this)).booleanValue())) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        if (!f(aVar)) {
            return Boolean.FALSE;
        }
        l1.a ownerType = aVar.getOwnerType();
        if (ownerType != null && !((Boolean) ownerType.k(this)).booleanValue()) {
            return Boolean.FALSE;
        }
        for (l1.a aVar2 : aVar.y0()) {
            if (!((Boolean) aVar2.k(this)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        if (!f(aVar)) {
            return Boolean.FALSE;
        }
        G1 lowerBounds = aVar.getLowerBounds();
        if (lowerBounds.isEmpty()) {
            lowerBounds = aVar.getUpperBounds();
        }
        return (Boolean) ((l1.a) ((AbstractC1239q) lowerBounds).r()).k(this);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return Boolean.valueOf(f(aVar));
    }
}
