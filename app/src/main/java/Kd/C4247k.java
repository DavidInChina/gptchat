package kd;

import Ng.F;
import Z8.AbstractC1809m0;
import Z8.b1;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import jf.C3961k;
import kf.AbstractC4268D;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.z;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: kd.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4247k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public z f37321Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f37322Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37323h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f37324i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4243g f37325j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37326k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247k(C4243g c4243g, C4255s c4255s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37325j0 = c4243g;
        this.f37326k0 = c4255s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4247k c4247k = new C4247k(this.f37325j0, this.f37326k0, abstractC4825e);
        c4247k.f37324i0 = obj;
        return c4247k;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4247k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.jvm.internal.A, java.lang.Object] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        A a5;
        long j6;
        z zVar;
        Object obj2;
        long uptimeMillis;
        Throwable a10;
        Throwable th2;
        String str;
        z zVar2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37323h0;
        jf.y yVar = jf.y.f36177a;
        C4255s c4255s = this.f37326k0;
        if (i10 != 0) {
            if (i10 == 1) {
                j6 = this.f37322Z;
                zVar = this.f37321Y;
                a5 = (A) this.f37324i0;
                try {
                    N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    obj2 = N.w(th2);
                    uptimeMillis = SystemClock.uptimeMillis() - j6;
                    a10 = C3961k.a(obj2);
                    if (a10 != null) {
                    }
                    AbstractC1809m0.a().b(b1.f23334c, AbstractC4268D.a1(new C3959i("total_time", new Long(uptimeMillis)), new C3959i("connected_time", new Long(a5.f37621Y)), new C3959i("connection_count", new Integer(zVar.f37647Y))));
                    c4255s.f37353f.setValue(null);
                    return yVar;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f6 = (F) this.f37324i0;
            C4243g c4243g = this.f37325j0;
            if (c4243g != null && (str = c4243g.f37303a) != null) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                try {
                    bd.d dVar = c4255s.f37351d;
                    zVar2 = obj4;
                    try {
                        C4246j c4246j = new C4246j(c4255s, obj4, str, obj3, null);
                        this.f37324i0 = obj3;
                        this.f37321Y = zVar2;
                        this.f37322Z = uptimeMillis2;
                        this.f37323h0 = 1;
                        if (K8.d.M0(dVar, 16, c4246j, this, 14) == enumC5000a) {
                            return enumC5000a;
                        }
                        a5 = obj3;
                        j6 = uptimeMillis2;
                        zVar = zVar2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        a5 = obj3;
                        j6 = uptimeMillis2;
                        zVar = zVar2;
                        obj2 = N.w(th2);
                        uptimeMillis = SystemClock.uptimeMillis() - j6;
                        a10 = C3961k.a(obj2);
                        if (a10 != null) {
                            Pc.e.a().a("Failed to connect to websockets after exponential backoff", a10, AbstractC4268D.a1(new C3959i("total_time", new Long(uptimeMillis)), new C3959i("connected_time", new Long(a5.f37621Y))));
                        }
                        AbstractC1809m0.a().b(b1.f23334c, AbstractC4268D.a1(new C3959i("total_time", new Long(uptimeMillis)), new C3959i("connected_time", new Long(a5.f37621Y)), new C3959i("connection_count", new Integer(zVar.f37647Y))));
                        c4255s.f37353f.setValue(null);
                        return yVar;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    zVar2 = obj4;
                }
            }
            return yVar;
        }
        obj2 = yVar;
        uptimeMillis = SystemClock.uptimeMillis() - j6;
        a10 = C3961k.a(obj2);
        if (a10 != null && !(a10 instanceof CancellationException)) {
            Pc.e.a().a("Failed to connect to websockets after exponential backoff", a10, AbstractC4268D.a1(new C3959i("total_time", new Long(uptimeMillis)), new C3959i("connected_time", new Long(a5.f37621Y))));
        }
        AbstractC1809m0.a().b(b1.f23334c, AbstractC4268D.a1(new C3959i("total_time", new Long(uptimeMillis)), new C3959i("connected_time", new Long(a5.f37621Y)), new C3959i("connection_count", new Integer(zVar.f37647Y))));
        c4255s.f37353f.setValue(null);
        return yVar;
    }
}
