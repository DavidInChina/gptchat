package B;

import B0.C0194k;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* renamed from: B.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0135j0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public C0194k f1365Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1366h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1367i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f1368j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1369k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1370l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135j0(kotlin.jvm.internal.B b10, kotlin.jvm.internal.B b11, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1369k0 = b10;
        this.f1370l0 = b11;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0135j0 c0135j0 = new C0135j0(this.f1369k0, this.f1370l0, abstractC4825e);
        c0135j0.f1368j0 = obj;
        return c0135j0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0135j0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[EDGE_INSN: B:67:0x00c3->B:39:0x00c3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:33:0x00a7). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i10;
        B0.N n10;
        Object obj3;
        Object obj4;
        Object obj5;
        int size;
        int i11;
        int size2;
        int i12;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i13 = this.f1367i0;
        int i14 = 1;
        int i15 = 2;
        C0194k c0194k = null;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    i10 = this.f1366h0;
                    C0194k c0194k2 = this.f1365Z;
                    B0.N n11 = (B0.N) this.f1368j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj2 = obj;
                    List list = ((C0194k) obj2).f1652a;
                    int size3 = list.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size3) {
                            break;
                        } else if (((B0.u) list.get(i16)).b()) {
                            i10 = i14;
                            break;
                        } else {
                            i16++;
                        }
                    }
                    kotlin.jvm.internal.B b10 = this.f1369k0;
                    boolean i17 = AbstractC0170v0.i(c0194k2, ((B0.u) b10.f37622Y).f1670a);
                    kotlin.jvm.internal.B b11 = this.f1370l0;
                    List list2 = c0194k2.f1652a;
                    if (!i17) {
                        int size4 = list2.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size4) {
                                obj4 = list2.get(i18);
                                if (((B0.u) obj4).f1673d) {
                                    break;
                                }
                                i18++;
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        B0.u uVar = (B0.u) obj4;
                        if (uVar != null) {
                            b10.f37622Y = uVar;
                            b11.f37622Y = uVar;
                        } else {
                            i10 = i14;
                            n10 = n11;
                            c0194k = null;
                            if (i10 == 0) {
                                EnumC0195l enumC0195l = EnumC0195l.f1657Z;
                                this.f1368j0 = n10;
                                this.f1365Z = c0194k;
                                this.f1366h0 = i10;
                                this.f1367i0 = i14;
                                obj5 = n10.c(enumC0195l, this);
                                if (obj5 == enumC5000a) {
                                    return enumC5000a;
                                }
                                C0194k c0194k3 = (C0194k) obj5;
                                List list3 = c0194k3.f1652a;
                                size = list3.size();
                                i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        if (!r9.y.Y((B0.u) list3.get(i11))) {
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        i10 = i14;
                                        break;
                                    }
                                }
                                List list4 = c0194k3.f1652a;
                                size2 = list4.size();
                                for (i12 = 0; i12 < size2; i12++) {
                                    B0.u uVar2 = (B0.u) list4.get(i12);
                                    if (uVar2.b() || r9.y.E0(uVar2, n10.f1614j0.f1623y0, n10.d())) {
                                        break;
                                    }
                                }
                                EnumC0195l enumC0195l2 = EnumC0195l.f1658h0;
                                this.f1368j0 = n10;
                                this.f1365Z = c0194k3;
                                this.f1366h0 = i10;
                                this.f1367i0 = i15;
                                obj2 = n10.c(enumC0195l2, this);
                                if (obj2 != enumC5000a) {
                                    return enumC5000a;
                                }
                                n11 = n10;
                                c0194k2 = c0194k3;
                                List list5 = ((C0194k) obj2).f1652a;
                                int size32 = list5.size();
                                int i162 = 0;
                                while (true) {
                                    if (i162 >= size32) {
                                    }
                                    i162++;
                                }
                                kotlin.jvm.internal.B b102 = this.f1369k0;
                                boolean i172 = AbstractC0170v0.i(c0194k2, ((B0.u) b102.f37622Y).f1670a);
                                kotlin.jvm.internal.B b112 = this.f1370l0;
                                List list22 = c0194k2.f1652a;
                                if (!i172) {
                                    int size5 = list22.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < size5) {
                                            obj3 = list22.get(i19);
                                            if (B0.t.a(((B0.u) obj3).f1670a, ((B0.u) b102.f37622Y).f1670a)) {
                                                break;
                                            }
                                            i19++;
                                        } else {
                                            obj3 = null;
                                            break;
                                        }
                                    }
                                    b112.f37622Y = obj3;
                                }
                            } else {
                                return jf.y.f36177a;
                            }
                        }
                    }
                    n10 = n11;
                    i14 = 1;
                    i15 = 2;
                    c0194k = null;
                    if (i10 == 0) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i10 = this.f1366h0;
                n10 = (B0.N) this.f1368j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                obj5 = obj;
                C0194k c0194k32 = (C0194k) obj5;
                List list32 = c0194k32.f1652a;
                size = list32.size();
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                    }
                    i11++;
                }
                List list42 = c0194k32.f1652a;
                size2 = list42.size();
                while (i12 < size2) {
                }
                EnumC0195l enumC0195l22 = EnumC0195l.f1658h0;
                this.f1368j0 = n10;
                this.f1365Z = c0194k32;
                this.f1366h0 = i10;
                this.f1367i0 = i15;
                obj2 = n10.c(enumC0195l22, this);
                if (obj2 != enumC5000a) {
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f1368j0;
            i10 = 0;
            if (i10 == 0) {
            }
        }
    }
}
