package l4;

import Ng.F;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.N;
import f4.q;
import java.util.LinkedHashMap;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37794Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f37795Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q4.j f37796h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f37797i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ q4.n f37798j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ f4.e f37799k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ o4.c f37800l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ l f37801m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, q4.j jVar, Object obj, q4.n nVar, f4.e eVar, o4.c cVar, l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37795Z = iVar;
        this.f37796h0 = jVar;
        this.f37797i0 = obj;
        this.f37798j0 = nVar;
        this.f37799k0 = eVar;
        this.f37800l0 = cVar;
        this.f37801m0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new g(this.f37795Z, this.f37796h0, this.f37797i0, this.f37798j0, this.f37799k0, this.f37800l0, this.f37801m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y yVar;
        boolean z10;
        o4.c cVar;
        l lVar;
        boolean z11;
        o4.f fVar;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37794Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            i iVar = this.f37795Z;
            q4.j jVar = this.f37796h0;
            Object obj2 = this.f37797i0;
            q4.n nVar = this.f37798j0;
            f4.e eVar = this.f37799k0;
            this.f37794Y = 1;
            obj = i.b(iVar, jVar, obj2, nVar, eVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C4335a c4335a = (C4335a) obj;
        u4.k kVar = this.f37795Z.f37815b;
        synchronized (kVar) {
            try {
                q qVar = (q) kVar.f46405Y.get();
                if (qVar != null) {
                    if (kVar.f46406Z == null) {
                        Context context = qVar.f29632a;
                        kVar.f46406Z = context;
                        context.registerComponentCallbacks(kVar);
                    }
                    yVar = y.f36177a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    kVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o4.e eVar2 = this.f37795Z.f37817d;
        o4.c cVar2 = this.f37800l0;
        q4.j jVar2 = this.f37796h0;
        eVar2.getClass();
        if (jVar2.f43861t.f43752Z && (fVar = (o4.f) ((q) eVar2.f40584a).f29634c.getValue()) != null && cVar2 != null) {
            Drawable drawable = c4335a.f37745a;
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c4335a.f37746b));
                String str = c4335a.f37748d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                fVar.f40586a.c(new o4.c(cVar2.f40580Y, A7.b.T1(cVar2.f40581Z)), bitmap, A7.b.T1(linkedHashMap));
                z10 = true;
                Drawable drawable2 = c4335a.f37745a;
                q4.j jVar3 = this.f37796h0;
                h4.f fVar2 = c4335a.f37747c;
                o4.c cVar3 = this.f37800l0;
                if (!z10) {
                    cVar = cVar3;
                } else {
                    cVar = null;
                }
                String str2 = c4335a.f37748d;
                boolean z12 = c4335a.f37746b;
                lVar = this.f37801m0;
                Bitmap.Config[] configArr = u4.e.f46388a;
                if (!(lVar instanceof l) && lVar.f37829g) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new q4.q(drawable2, jVar3, fVar2, cVar, str2, z12, z11);
            }
        }
        z10 = false;
        Drawable drawable22 = c4335a.f37745a;
        q4.j jVar32 = this.f37796h0;
        h4.f fVar22 = c4335a.f37747c;
        o4.c cVar32 = this.f37800l0;
        if (!z10) {
        }
        String str22 = c4335a.f37748d;
        boolean z122 = c4335a.f37746b;
        lVar = this.f37801m0;
        Bitmap.Config[] configArr2 = u4.e.f46388a;
        if (!(lVar instanceof l)) {
        }
        z11 = false;
        return new q4.q(drawable22, jVar32, fVar22, cVar, str22, z122, z11);
    }
}
