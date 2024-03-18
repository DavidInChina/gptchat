package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.z1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183z1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public long f1582Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1583Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ long f1584h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ A1 f1585i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183z1(A1 a12, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1585i0 = a12;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0183z1 c0183z1 = new C0183z1(this.f1585i0, abstractC4825e);
        c0183z1.f1584h0 = ((Z0.p) obj).f22815a;
        return c0183z1;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0183z1) create(new Z0.p(((Z0.p) obj).f22815a), (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j6;
        long j10;
        Object obj2;
        long j11;
        long j12;
        Object obj3;
        Object obj4;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1583Z;
        A1 a12 = this.f1585i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        long j13 = this.f1582Y;
                        j10 = this.f1584h0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        j6 = j13;
                        obj2 = obj;
                        return new Z0.p(Z0.p.d(j10, Z0.p.d(j6, ((Z0.p) obj2).f22815a)));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = this.f1582Y;
                j11 = this.f1584h0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                obj3 = obj;
                j6 = ((Z0.p) obj3).f22815a;
                A0.d dVar = a12.f1027f;
                long d10 = Z0.p.d(j12, j6);
                this.f1584h0 = j11;
                this.f1582Y = j6;
                this.f1583Z = 3;
                obj2 = dVar.a(d10, j6, this);
                if (obj2 != enumC5000a) {
                    return enumC5000a;
                }
                j10 = j11;
                return new Z0.p(Z0.p.d(j10, Z0.p.d(j6, ((Z0.p) obj2).f22815a)));
            }
            j11 = this.f1584h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            obj4 = obj;
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            j11 = this.f1584h0;
            A0.d dVar2 = a12.f1027f;
            this.f1584h0 = j11;
            this.f1583Z = 1;
            obj4 = dVar2.b(j11, this);
            if (obj4 == enumC5000a) {
                return enumC5000a;
            }
        }
        long d11 = Z0.p.d(j11, ((Z0.p) obj4).f22815a);
        this.f1584h0 = j11;
        this.f1582Y = d11;
        this.f1583Z = 2;
        obj3 = a12.b(d11, this);
        if (obj3 == enumC5000a) {
            return enumC5000a;
        }
        j12 = d11;
        j6 = ((Z0.p) obj3).f22815a;
        A0.d dVar3 = a12.f1027f;
        long d102 = Z0.p.d(j12, j6);
        this.f1584h0 = j11;
        this.f1582Y = j6;
        this.f1583Z = 3;
        obj2 = dVar3.a(d102, j6, this);
        if (obj2 != enumC5000a) {
        }
    }
}
