package Z;

import Ng.AbstractC1073l0;
import Ng.C1079o0;
import b0.C2099c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public List f22452Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f22453Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f22454h0;

    /* renamed from: i0  reason: collision with root package name */
    public Set f22455i0;

    /* renamed from: j0  reason: collision with root package name */
    public Set f22456j0;

    /* renamed from: k0  reason: collision with root package name */
    public C2099c f22457k0;

    /* renamed from: l0  reason: collision with root package name */
    public C2099c f22458l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f22459m0;

    /* renamed from: n0  reason: collision with root package name */
    public /* synthetic */ AbstractC1700a0 f22460n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ E0 f22461o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(E0 e02, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f22461o0 = e02;
    }

    public static final void p(List list, List list2, List list3, Set set, Set set2, C2099c c2099c, C2099c c2099c2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        c2099c.clear();
        c2099c2.clear();
    }

    public static final void r(List list, E0 e02) {
        list.clear();
        synchronized (e02.f22466c) {
            try {
                ArrayList arrayList = e02.f22474k;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((AbstractC1704c0) arrayList.get(i10));
                }
                e02.f22474k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ng.F f6 = (Ng.F) obj;
        D0 d02 = new D0(this.f22461o0, (AbstractC4825e) obj3);
        d02.f22460n0 = (AbstractC1700a0) obj2;
        return d02.invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0131 -> B:34:0x0138). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0144 -> B:35:0x0140). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2099c c2099c;
        C2099c c2099c2;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC1700a0 abstractC1700a0;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C2099c c2099c3;
        E0 e02;
        int i10;
        E0 e03;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f22459m0;
        char c10 = 2;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C2099c c2099c4 = this.f22458l0;
                    C2099c c2099c5 = this.f22457k0;
                    ?? r82 = this.f22454h0;
                    ?? r92 = this.f22453Z;
                    ?? r10 = this.f22452Y;
                    AbstractC1700a0 abstractC1700a02 = this.f22460n0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    ArrayList arrayList7 = r82;
                    arrayList4 = r10;
                    c2099c2 = c2099c5;
                    linkedHashSet2 = this.f22455i0;
                    EnumC5000a enumC5000a2 = enumC5000a;
                    char c11 = 2;
                    c2099c = c2099c4;
                    abstractC1700a0 = abstractC1700a02;
                    linkedHashSet = this.f22456j0;
                    arrayList = r92;
                    E0.q(this.f22461o0);
                    c10 = c11;
                    enumC5000a = enumC5000a2;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList7;
                    i12 = 1;
                    e02 = this.f22461o0;
                    synchronized (e02.f22466c) {
                        i10 = (e02.f22480q ? 1 : 0) ^ i12;
                    }
                    if (i10 == 0) {
                        C1079o0 c1079o0 = e02.f22484u;
                        c1079o0.getClass();
                        Iterator it = P4.a.G0(new Ng.u0(null, c1079o0)).iterator();
                        while (it.hasNext()) {
                            if (((AbstractC1073l0) it.next()).a()) {
                                e03 = this.f22461o0;
                                this.f22460n0 = abstractC1700a0;
                                this.f22452Y = arrayList2;
                                this.f22453Z = arrayList;
                                this.f22454h0 = arrayList3;
                                this.f22455i0 = linkedHashSet2;
                                this.f22456j0 = linkedHashSet;
                                this.f22457k0 = c2099c2;
                                this.f22458l0 = c2099c;
                                this.f22459m0 = i12;
                                if (E0.p(e03, this) != enumC5000a) {
                                    return enumC5000a;
                                }
                                arrayList4 = arrayList2;
                                arrayList5 = arrayList;
                                arrayList6 = arrayList3;
                                linkedHashSet4 = linkedHashSet2;
                                linkedHashSet3 = linkedHashSet;
                                c2099c3 = c2099c2;
                                if (!E0.t(this.f22461o0)) {
                                    C2099c c2099c6 = c2099c;
                                    EnumC5000a enumC5000a3 = enumC5000a;
                                    C2099c c2099c7 = c2099c3;
                                    arrayList7 = arrayList6;
                                    C0 c02 = new C0(this.f22461o0, c2099c3, c2099c, arrayList4, arrayList5, linkedHashSet4, arrayList6, linkedHashSet3);
                                    this.f22460n0 = abstractC1700a0;
                                    this.f22452Y = arrayList4;
                                    this.f22453Z = arrayList5;
                                    this.f22454h0 = arrayList7;
                                    this.f22455i0 = linkedHashSet4;
                                    this.f22456j0 = linkedHashSet3;
                                    this.f22457k0 = c2099c7;
                                    this.f22458l0 = c2099c6;
                                    c11 = 2;
                                    this.f22459m0 = 2;
                                    enumC5000a2 = enumC5000a3;
                                    if (abstractC1700a0.S(c02, this) == enumC5000a2) {
                                        return enumC5000a2;
                                    }
                                    c2099c2 = c2099c7;
                                    c2099c = c2099c6;
                                    arrayList = arrayList5;
                                    linkedHashSet2 = linkedHashSet4;
                                    linkedHashSet = linkedHashSet3;
                                    E0.q(this.f22461o0);
                                    c10 = c11;
                                    enumC5000a = enumC5000a2;
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList7;
                                    i12 = 1;
                                    e02 = this.f22461o0;
                                    synchronized (e02.f22466c) {
                                    }
                                } else {
                                    arrayList7 = arrayList6;
                                    c2099c2 = c2099c3;
                                    c10 = c10;
                                    enumC5000a = enumC5000a;
                                    arrayList2 = arrayList4;
                                    arrayList = arrayList5;
                                    linkedHashSet2 = linkedHashSet4;
                                    linkedHashSet = linkedHashSet3;
                                    arrayList3 = arrayList7;
                                    i12 = 1;
                                    e02 = this.f22461o0;
                                    synchronized (e02.f22466c) {
                                    }
                                }
                            }
                        }
                        return jf.y.f36177a;
                    }
                    e03 = this.f22461o0;
                    this.f22460n0 = abstractC1700a0;
                    this.f22452Y = arrayList2;
                    this.f22453Z = arrayList;
                    this.f22454h0 = arrayList3;
                    this.f22455i0 = linkedHashSet2;
                    this.f22456j0 = linkedHashSet;
                    this.f22457k0 = c2099c2;
                    this.f22458l0 = c2099c;
                    this.f22459m0 = i12;
                    if (E0.p(e03, this) != enumC5000a) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C2099c c2099c8 = this.f22458l0;
                C2099c c2099c9 = this.f22457k0;
                ?? r83 = this.f22454h0;
                ?? r93 = this.f22453Z;
                ?? r102 = this.f22452Y;
                AbstractC1700a0 abstractC1700a03 = this.f22460n0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                c2099c3 = c2099c9;
                linkedHashSet3 = this.f22456j0;
                linkedHashSet4 = this.f22455i0;
                arrayList6 = r83;
                arrayList5 = r93;
                arrayList4 = r102;
                c2099c = c2099c8;
                abstractC1700a0 = abstractC1700a03;
                if (!E0.t(this.f22461o0)) {
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            abstractC1700a0 = this.f22460n0;
            arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            arrayList3 = new ArrayList();
            linkedHashSet2 = new LinkedHashSet();
            linkedHashSet = new LinkedHashSet();
            c2099c2 = new C2099c();
            c2099c = new C2099c();
            e02 = this.f22461o0;
            synchronized (e02.f22466c) {
            }
        }
    }
}
