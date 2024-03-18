package H0;

import Pg.C1171d;
import Qg.AbstractC1207j;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class t1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C1171d f7043Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f7044Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f7045h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ ContentResolver f7046i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Uri f7047j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ u1 f7048k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f7049l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Context f7050m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ContentResolver contentResolver, Uri uri, u1 u1Var, Pg.o oVar, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7046i0 = contentResolver;
        this.f7047j0 = uri;
        this.f7048k0 = u1Var;
        this.f7049l0 = oVar;
        this.f7050m0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        t1 t1Var = new t1(this.f7046i0, this.f7047j0, this.f7048k0, this.f7049l0, this.f7050m0, abstractC4825e);
        t1Var.f7045h0 = obj;
        return t1Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t1) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:13:0x002b, B:15:0x003c, B:16:0x0042, B:20:0x0052, B:22:0x005a), top: B:29:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:8:0x0019). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC1207j abstractC1207j;
        C1171d c1171d;
        AbstractC1207j abstractC1207j2;
        Object a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7044Z;
        u1 u1Var = this.f7048k0;
        ContentResolver contentResolver = this.f7046i0;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        c1171d = this.f7043Y;
                        abstractC1207j = (AbstractC1207j) this.f7045h0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        abstractC1207j2 = abstractC1207j;
                        this.f7045h0 = abstractC1207j2;
                        this.f7043Y = c1171d;
                        this.f7044Z = 1;
                        a5 = c1171d.a(this);
                        if (a5 == enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC1207j = abstractC1207j2;
                        obj = a5;
                        if (!((Boolean) obj).booleanValue()) {
                            c1171d.b();
                            Float f6 = new Float(Settings.Global.getFloat(this.f7050m0.getContentResolver(), "animator_duration_scale", 1.0f));
                            this.f7045h0 = abstractC1207j;
                            this.f7043Y = c1171d;
                            this.f7044Z = 2;
                            if (abstractC1207j.c(f6, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            abstractC1207j2 = abstractC1207j;
                            this.f7045h0 = abstractC1207j2;
                            this.f7043Y = c1171d;
                            this.f7044Z = 1;
                            a5 = c1171d.a(this);
                            if (a5 == enumC5000a) {
                            }
                        } else {
                            contentResolver.unregisterContentObserver(u1Var);
                            return jf.y.f36177a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c1171d = this.f7043Y;
                    abstractC1207j = (AbstractC1207j) this.f7045h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                abstractC1207j2 = (AbstractC1207j) this.f7045h0;
                contentResolver.registerContentObserver(this.f7047j0, false, u1Var);
                c1171d = this.f7049l0.iterator();
                this.f7045h0 = abstractC1207j2;
                this.f7043Y = c1171d;
                this.f7044Z = 1;
                a5 = c1171d.a(this);
                if (a5 == enumC5000a) {
                }
            }
        } catch (Throwable th2) {
            contentResolver.unregisterContentObserver(u1Var);
            throw th2;
        }
    }
}
