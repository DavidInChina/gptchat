package l4;

import Ng.F;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import jf.y;
import kf.q;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public List f37802Y;

    /* renamed from: Z  reason: collision with root package name */
    public q4.n f37803Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37804h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37805i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37806j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f37807k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ i f37808l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C4335a f37809m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ q4.n f37810n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ List f37811o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ f4.e f37812p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ q4.j f37813q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, C4335a c4335a, q4.n nVar, List list, f4.e eVar, q4.j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37808l0 = iVar;
        this.f37809m0 = c4335a;
        this.f37810n0 = nVar;
        this.f37811o0 = list;
        this.f37812p0 = eVar;
        this.f37813q0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        h hVar = new h(this.f37808l0, this.f37809m0, this.f37810n0, this.f37811o0, this.f37812p0, this.f37813q0, abstractC4825e);
        hVar.f37807k0 = obj;
        return hVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        F f6;
        List list;
        q4.n nVar;
        int i10;
        int i11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i12 = this.f37806j0;
        f4.e eVar = this.f37812p0;
        C4335a c4335a = this.f37809m0;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f37805i0;
                int i13 = this.f37804h0;
                nVar = this.f37803Z;
                list = this.f37802Y;
                f6 = (F) this.f37807k0;
                N.B0(obj);
                bitmap = (Bitmap) obj;
                Ad.l.h0(f6);
                i10 = i13 + 1;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            f6 = (F) this.f37807k0;
            Drawable drawable = c4335a.f37745a;
            this.f37808l0.getClass();
            boolean z10 = drawable instanceof BitmapDrawable;
            nVar = this.f37810n0;
            if (z10) {
                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (q.S2(config, u4.e.f46388a)) {
                    bitmap = bitmap2;
                    eVar.getClass();
                    list = this.f37811o0;
                    i11 = list.size();
                    i10 = 0;
                }
            }
            bitmap = Ad.l.b0(drawable, nVar.f43870b, nVar.f43872d, nVar.f43873e, nVar.f43874f);
            eVar.getClass();
            list = this.f37811o0;
            i11 = list.size();
            i10 = 0;
        }
        if (i10 >= i11) {
            eVar.getClass();
            return new C4335a(new BitmapDrawable(this.f37813q0.f43842a.getResources(), bitmap), c4335a.f37746b, c4335a.f37747c, c4335a.f37748d);
        }
        AbstractC2469q0.p(list.get(i10));
        r4.h hVar = nVar.f43872d;
        this.f37807k0 = f6;
        this.f37802Y = list;
        this.f37803Z = nVar;
        this.f37804h0 = i10;
        this.f37805i0 = i11;
        this.f37806j0 = 1;
        throw null;
    }
}
