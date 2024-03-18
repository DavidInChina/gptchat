package Rd;

import Ng.F;
import Pg.C1171d;
import Qd.A;
import Qd.C1183b;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import jf.y;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C1171d f15428Y;

    /* renamed from: Z  reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f15429Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f15430h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15431i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ f f15432j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15432j0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f15432j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: Exception -> 0x0019, LOOP:0: B:27:0x009d->B:29:0x00a3, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:21:0x0061, B:23:0x0066, B:26:0x0097, B:27:0x009d, B:29:0x00a3), top: B:48:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[EDGE_INSN: B:51:0x00ea->B:41:0x00ea ?: BREAK  ] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005f -> B:31:0x00c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:26:0x0097). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ad -> B:31:0x00c5). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1171d c1171d;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15431i0;
        f fVar = this.f15432j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    boolean z10 = this.f15430h0;
                    com.segment.analytics.kotlin.core.a aVar = this.f15429Z;
                    C1171d c1171d2 = this.f15428Y;
                    try {
                        N.B0(obj);
                    } catch (Exception e10) {
                        AbstractC4344b.W0(fVar.f15434a, e10);
                        C1183b c1183b = Qd.i.Companion;
                        AbstractC3557B.s2(c1183b, "Error adding payload: " + aVar, 1);
                    }
                    for (Ud.b bVar : fVar.f15436c) {
                        bVar.e(aVar);
                    }
                    if (z10) {
                        List<Ud.b> list = fVar.f15436c;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (Ud.b bVar2 : list) {
                                if (bVar2.d()) {
                                    break;
                                }
                            }
                        }
                    } else {
                        fVar.f15439f.t("#!upload");
                        for (Ud.b bVar3 : fVar.f15436c) {
                            bVar3.b();
                        }
                    }
                    c1171d = c1171d2;
                    this.f15428Y = c1171d;
                    this.f15429Z = null;
                    this.f15431i0 = 1;
                    obj = c1171d.a(this);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c1171d2 = c1171d;
                    if (!((Boolean) obj).booleanValue()) {
                        aVar = (com.segment.analytics.kotlin.core.a) c1171d2.b();
                        z10 = AbstractC3557B.K(aVar.f(), "#!flush");
                        if (!z10) {
                            fVar.getClass();
                            Qd.i iVar = fVar.f15434a;
                            String c10 = f.c(aVar);
                            r.f.M(iVar, fVar.f15435b + " running " + c10);
                            A h10 = iVar.h();
                            this.f15428Y = c1171d2;
                            this.f15429Z = aVar;
                            this.f15430h0 = z10;
                            this.f15431i0 = 2;
                            if (h10.e(5, c10, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            while (r11.hasNext()) {
                            }
                        }
                        if (z10) {
                        }
                        c1171d = c1171d2;
                        this.f15428Y = c1171d;
                        this.f15429Z = null;
                        this.f15431i0 = 1;
                        obj = c1171d.a(this);
                        if (obj == enumC5000a) {
                        }
                        c1171d2 = c1171d;
                        if (!((Boolean) obj).booleanValue()) {
                            return y.f36177a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c1171d = this.f15428Y;
                N.B0(obj);
                c1171d2 = c1171d;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            N.B0(obj);
            Pg.k kVar = fVar.f15438e;
            kVar.getClass();
            c1171d = new C1171d(kVar);
            this.f15428Y = c1171d;
            this.f15429Z = null;
            this.f15431i0 = 1;
            obj = c1171d.a(this);
            if (obj == enumC5000a) {
            }
            c1171d2 = c1171d;
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }
}
