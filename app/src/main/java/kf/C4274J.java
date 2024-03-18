package kf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* renamed from: kf.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4274J extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public Object f37450Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f37451h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37452i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37453j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f37454k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f37455l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f37456m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Iterator f37457n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ boolean f37458o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ boolean f37459p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4274J(int i10, int i11, Iterator it, boolean z10, boolean z11, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37455l0 = i10;
        this.f37456m0 = i11;
        this.f37457n0 = it;
        this.f37458o0 = z10;
        this.f37459p0 = z11;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4274J c4274j = new C4274J(this.f37455l0, this.f37456m0, this.f37457n0, this.f37458o0, this.f37459p0, abstractC4825e);
        c4274j.f37454k0 = obj;
        return c4274j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4274J) create((Kg.l) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Kg.l lVar;
        C4272H c4272h;
        Iterator it;
        C4272H c4272h2;
        Kg.l lVar2;
        Object obj2;
        Object[] objArr;
        int i10;
        Kg.l lVar3;
        ArrayList arrayList;
        Iterator it2;
        int i11;
        Object obj3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i12 = this.f37453j0;
        boolean z10 = this.f37459p0;
        boolean z11 = this.f37458o0;
        int i13 = this.f37456m0;
        int i14 = this.f37455l0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c4272h2 = (C4272H) this.f37450Z;
                            lVar2 = (Kg.l) this.f37454k0;
                            N.B0(obj);
                            c4272h2.s(i13);
                            if (c4272h2.f37449i0 <= i13) {
                                if (z11) {
                                    obj3 = c4272h2;
                                } else {
                                    obj3 = new ArrayList(c4272h2);
                                }
                                this.f37454k0 = lVar2;
                                this.f37450Z = c4272h2;
                                this.f37451h0 = null;
                                this.f37453j0 = 4;
                                lVar2.c(obj3, this);
                                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                                return enumC5000a;
                            }
                            if (true ^ c4272h2.isEmpty()) {
                                this.f37454k0 = null;
                                this.f37450Z = null;
                                this.f37451h0 = null;
                                this.f37453j0 = 5;
                                lVar2.c(c4272h2, this);
                                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                                return enumC5000a;
                            }
                            return jf.y.f36177a;
                        }
                    } else {
                        it = this.f37451h0;
                        c4272h = (C4272H) this.f37450Z;
                        lVar = (Kg.l) this.f37454k0;
                        N.B0(obj);
                        c4272h.s(i13);
                        while (it.hasNext()) {
                            Object next = it.next();
                            int r10 = c4272h.r();
                            int i15 = c4272h.f37447Z;
                            if (r10 != i15) {
                                int i16 = c4272h.f37448h0;
                                int i17 = c4272h.f37449i0;
                                Object[] objArr2 = c4272h.f37446Y;
                                objArr2[(i16 + i17) % i15] = next;
                                c4272h.f37449i0 = i17 + 1;
                                if (c4272h.r() == i15) {
                                    if (c4272h.f37449i0 < i14) {
                                        int i18 = i15 + (i15 >> 1) + 1;
                                        if (i18 > i14) {
                                            i18 = i14;
                                        }
                                        if (c4272h.f37448h0 == 0) {
                                            objArr = Arrays.copyOf(objArr2, i18);
                                            AbstractC3557B.b0("copyOf(...)", objArr);
                                        } else {
                                            objArr = c4272h.toArray(new Object[i18]);
                                        }
                                        c4272h = new C4272H(c4272h.f37449i0, objArr);
                                    } else {
                                        if (z11) {
                                            obj2 = c4272h;
                                        } else {
                                            obj2 = new ArrayList(c4272h);
                                        }
                                        this.f37454k0 = lVar;
                                        this.f37450Z = c4272h;
                                        this.f37451h0 = it;
                                        this.f37453j0 = 3;
                                        lVar.c(obj2, this);
                                        EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                                        return enumC5000a;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("ring buffer is full");
                            }
                        }
                        if (z10) {
                            c4272h2 = c4272h;
                            lVar2 = lVar;
                            if (c4272h2.f37449i0 <= i13) {
                            }
                        }
                        return jf.y.f36177a;
                    }
                }
                N.B0(obj);
                return jf.y.f36177a;
            }
            i11 = this.f37452i0;
            it2 = this.f37451h0;
            arrayList = (ArrayList) this.f37450Z;
            lVar3 = (Kg.l) this.f37454k0;
            N.B0(obj);
            if (z11) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i14);
            }
            i10 = i11;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i11 > 0) {
                    i11--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i14) {
                        this.f37454k0 = lVar3;
                        this.f37450Z = arrayList;
                        this.f37451h0 = it2;
                        this.f37452i0 = i10;
                        this.f37453j0 = 1;
                        lVar3.c(arrayList, this);
                        EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                        return enumC5000a;
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (z10 || arrayList.size() == i14)) {
                this.f37454k0 = null;
                this.f37450Z = null;
                this.f37451h0 = null;
                this.f37453j0 = 2;
                lVar3.c(arrayList, this);
                EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                return enumC5000a;
            }
            return jf.y.f36177a;
        }
        N.B0(obj);
        Kg.l lVar4 = (Kg.l) this.f37454k0;
        int i19 = 1024;
        if (i14 <= 1024) {
            i19 = i14;
        }
        i10 = i13 - i14;
        Iterator it3 = this.f37457n0;
        if (i10 >= 0) {
            arrayList = new ArrayList(i19);
            lVar3 = lVar4;
            i11 = 0;
            it2 = it3;
            while (it2.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
                this.f37454k0 = null;
                this.f37450Z = null;
                this.f37451h0 = null;
                this.f37453j0 = 2;
                lVar3.c(arrayList, this);
                EnumC5000a enumC5000a62 = EnumC5000a.f41328Y;
                return enumC5000a;
            }
            return jf.y.f36177a;
        }
        c4272h = new C4272H(0, new Object[i19]);
        lVar = lVar4;
        it = it3;
        while (it.hasNext()) {
        }
        if (z10) {
        }
        return jf.y.f36177a;
    }
}
