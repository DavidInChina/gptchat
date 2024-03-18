package W;

import A.AbstractC0044t0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: W.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1546f implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f20038a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f20039b;

    public C1546f(float f6, float f10) {
        this.f20038a = f6;
        this.f20039b = f10;
    }

    public static final void f(ArrayList arrayList, kotlin.jvm.internal.z zVar, E0.P p10, float f6, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.z zVar2, ArrayList arrayList4, kotlin.jvm.internal.z zVar3, kotlin.jvm.internal.z zVar4) {
        if (!arrayList.isEmpty()) {
            zVar.f37647Y = p10.a0(f6) + zVar.f37647Y;
        }
        arrayList.add(0, kf.t.K2(arrayList2));
        arrayList3.add(Integer.valueOf(zVar2.f37647Y));
        arrayList4.add(Integer.valueOf(zVar.f37647Y));
        zVar.f37647Y += zVar2.f37647Y;
        zVar3.f37647Y = Math.max(zVar3.f37647Y, zVar4.f37647Y);
        arrayList2.clear();
        zVar4.f37647Y = 0;
        zVar2.f37647Y = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[SYNTHETIC] */
    @Override // E0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E0.O a(E0.P p10, List list, long j6) {
        Object obj;
        ArrayList arrayList;
        kotlin.jvm.internal.z zVar;
        kotlin.jvm.internal.z zVar2;
        int i10;
        int i11;
        ArrayList arrayList2;
        E0.d0 d0Var;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Object obj2 = new Object();
        Object obj3 = new Object();
        ArrayList arrayList6 = new ArrayList();
        Object obj4 = new Object();
        Object obj5 = new Object();
        int size = list.size();
        int i12 = 0;
        kotlin.jvm.internal.z zVar3 = obj5;
        kotlin.jvm.internal.z zVar4 = obj4;
        while (true) {
            int i13 = i12;
            if (i13 >= size) {
                break;
            }
            E0.d0 o10 = ((E0.M) list.get(i13)).o(j6);
            boolean isEmpty = arrayList6.isEmpty();
            kotlin.jvm.internal.z zVar5 = obj2;
            float f6 = this.f20038a;
            if (!isEmpty) {
                if (p10.a0(f6) + zVar4.f37647Y + o10.f4053Y > Z0.a.h(j6)) {
                    ArrayList arrayList7 = arrayList3;
                    arrayList2 = arrayList3;
                    d0Var = o10;
                    i11 = i13;
                    i10 = size;
                    zVar2 = zVar3;
                    zVar = zVar4;
                    arrayList = arrayList6;
                    obj = obj3;
                    f(arrayList7, obj3, p10, this.f20039b, arrayList6, arrayList4, zVar3, arrayList5, zVar5, zVar);
                    kotlin.jvm.internal.z zVar6 = zVar;
                    if (!(!arrayList.isEmpty())) {
                        zVar6.f37647Y = p10.a0(f6) + zVar6.f37647Y;
                    }
                    ArrayList arrayList8 = arrayList;
                    arrayList8.add(d0Var);
                    zVar6.f37647Y += d0Var.f4053Y;
                    kotlin.jvm.internal.z zVar7 = zVar2;
                    zVar7.f37647Y = Math.max(zVar7.f37647Y, d0Var.f4054Z);
                    i12 = i11 + 1;
                    arrayList6 = arrayList8;
                    zVar4 = zVar6;
                    arrayList3 = arrayList2;
                    obj2 = zVar5;
                    size = i10;
                    obj3 = obj;
                    zVar3 = zVar7;
                }
            }
            i11 = i13;
            i10 = size;
            zVar2 = zVar3;
            zVar = zVar4;
            arrayList = arrayList6;
            obj = obj3;
            arrayList2 = arrayList3;
            d0Var = o10;
            kotlin.jvm.internal.z zVar62 = zVar;
            if (!(!arrayList.isEmpty())) {
            }
            ArrayList arrayList82 = arrayList;
            arrayList82.add(d0Var);
            zVar62.f37647Y += d0Var.f4053Y;
            kotlin.jvm.internal.z zVar72 = zVar2;
            zVar72.f37647Y = Math.max(zVar72.f37647Y, d0Var.f4054Z);
            i12 = i11 + 1;
            arrayList6 = arrayList82;
            zVar4 = zVar62;
            arrayList3 = arrayList2;
            obj2 = zVar5;
            size = i10;
            obj3 = obj;
            zVar3 = zVar72;
        }
        ArrayList arrayList9 = arrayList6;
        kotlin.jvm.internal.z zVar8 = obj3;
        ArrayList arrayList10 = arrayList3;
        kotlin.jvm.internal.z zVar9 = obj2;
        kotlin.jvm.internal.z zVar10 = zVar4;
        if (!arrayList9.isEmpty()) {
            f(arrayList10, zVar8, p10, this.f20039b, arrayList9, arrayList4, zVar3, arrayList5, zVar9, zVar10);
        }
        int max = Math.max(zVar9.f37647Y, Z0.a.j(j6));
        return p10.j0(max, Math.max(zVar8.f37647Y, Z0.a.i(j6)), kf.w.f37484Y, new C1541e(arrayList10, p10, this.f20038a, max, arrayList5));
    }

    @Override // E0.N
    public final /* synthetic */ int b(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
