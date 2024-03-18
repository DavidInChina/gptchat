package q9;

import Ng.F;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import l0.AbstractC4327s;
import l0.C4310b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: q9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5286c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f43983Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f43984Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f43985h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f43986i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f43987j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f43988k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f43989l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f43990m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5286c(boolean z10, List list, long j6, long j10, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f43986i0 = z10;
        this.f43987j0 = list;
        this.f43988k0 = j6;
        this.f43989l0 = j10;
        this.f43990m0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5286c c5286c = new C5286c(this.f43986i0, this.f43987j0, this.f43988k0, this.f43989l0, this.f43990m0, abstractC4825e);
        c5286c.f43985h0 = obj;
        return c5286c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5286c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:25:0x0063). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F f6;
        int i10;
        AbstractC4327s abstractC4327s;
        float f10;
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f43984Z;
        List list = this.f43987j0;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f43983Y;
                f6 = (F) this.f43985h0;
                N.B0(obj);
                int i12 = i10 + 1;
                Object obj2 = list.get(i10 % list.size());
                int i13 = AbstractC5288e.f44000c;
                this.f43990m0.setValue(obj2);
                i10 = i12;
                AbstractC4831k i14 = f6.i();
                AbstractC3557B.c0("<this>", i14);
                abstractC4327s = (AbstractC4327s) i14.get(C4310b.f37708u0);
                if (abstractC4327s != null) {
                    f10 = abstractC4327s.a0();
                } else {
                    f10 = 1.0f;
                }
                if (f10 <= 0.0f && (this.f43986i0 || i10 < list.size())) {
                    if (i10 == 1) {
                        j6 = this.f43988k0;
                    } else {
                        j6 = this.f43989l0;
                    }
                    this.f43985h0 = f6;
                    this.f43983Y = i10;
                    this.f43984Z = 1;
                    if (L4.a.V(j6, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    int i122 = i10 + 1;
                    Object obj22 = list.get(i10 % list.size());
                    int i132 = AbstractC5288e.f44000c;
                    this.f43990m0.setValue(obj22);
                    i10 = i122;
                    AbstractC4831k i142 = f6.i();
                    AbstractC3557B.c0("<this>", i142);
                    abstractC4327s = (AbstractC4327s) i142.get(C4310b.f37708u0);
                    if (abstractC4327s != null) {
                    }
                    if (f10 <= 0.0f) {
                    }
                    return y.f36177a;
                }
                return y.f36177a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        f6 = (F) this.f43985h0;
        i10 = 1;
        AbstractC4831k i1422 = f6.i();
        AbstractC3557B.c0("<this>", i1422);
        abstractC4327s = (AbstractC4327s) i1422.get(C4310b.f37708u0);
        if (abstractC4327s != null) {
        }
        if (f10 <= 0.0f) {
        }
        return y.f36177a;
    }
}
