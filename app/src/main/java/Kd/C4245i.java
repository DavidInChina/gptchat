package kd;

import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.A;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import se.C5621c;

/* renamed from: kd.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4245i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37311Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37312Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37313h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ A f37314i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4245i(C4255s c4255s, A a5, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37313h0 = c4255s;
        this.f37314i0 = a5;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4245i c4245i = new C4245i(this.f37313h0, this.f37314i0, abstractC4825e);
        c4245i.f37312Z = obj;
        return c4245i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4245i) create((C5621c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37311Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            long uptimeMillis = SystemClock.uptimeMillis();
            A a5 = this.f37314i0;
            C4244h c4244h = new C4244h(this.f37313h0, (C5621c) this.f37312Z, a5, uptimeMillis, null);
            this.f37311Y = 1;
            if (Ad.l.e0(c4244h, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
