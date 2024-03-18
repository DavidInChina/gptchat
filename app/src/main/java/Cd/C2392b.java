package cd;

import Pc.e;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import x8.W;

/* renamed from: cd.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2392b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C2391a f26582Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f26583Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ boolean f26584h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f26585i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ NetworkRequest f26586j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C2393c f26587k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2392b(ConnectivityManager connectivityManager, NetworkRequest networkRequest, C2393c c2393c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26585i0 = connectivityManager;
        this.f26586j0 = networkRequest;
        this.f26587k0 = c2393c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2392b c2392b = new C2392b(this.f26585i0, this.f26586j0, this.f26587k0, abstractC4825e);
        c2392b.f26584h0 = ((Boolean) obj).booleanValue();
        return c2392b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C2392b) create(bool, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C2391a c2391a;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26583Z;
        ConnectivityManager connectivityManager = this.f26585i0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2391a = this.f26582Y;
            try {
                N.B0(obj);
                throw new RuntimeException();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } else {
            N.B0(obj);
            if (!this.f26584h0) {
                return y.f36177a;
            }
            C2391a c2391a2 = new C2391a(this.f26587k0);
            try {
                connectivityManager.registerNetworkCallback(this.f26586j0, c2391a2);
            } catch (RuntimeException e10) {
                W.W(e.a(), "Unable to register connectivity callbacks. Features that rely on ConnectivityChecker may not work properly", e10, null, 4);
            }
            try {
                this.f26582Y = c2391a2;
                this.f26583Z = 1;
                R4.b.G(this);
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                return enumC5000a;
            } catch (Throwable th4) {
                c2391a = c2391a2;
                th2 = th4;
            }
        }
        connectivityManager.unregisterNetworkCallback(c2391a);
        throw th2;
    }
}
