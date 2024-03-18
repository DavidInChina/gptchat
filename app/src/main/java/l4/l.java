package l4;

import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final q4.j f37823a;

    /* renamed from: b  reason: collision with root package name */
    public final List f37824b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37825c;

    /* renamed from: d  reason: collision with root package name */
    public final q4.j f37826d;

    /* renamed from: e  reason: collision with root package name */
    public final r4.h f37827e;

    /* renamed from: f  reason: collision with root package name */
    public final f4.e f37828f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f37829g;

    public l(q4.j jVar, List list, int i10, q4.j jVar2, r4.h hVar, f4.e eVar, boolean z10) {
        this.f37823a = jVar;
        this.f37824b = list;
        this.f37825c = i10;
        this.f37826d = jVar2;
        this.f37827e = hVar;
        this.f37828f = eVar;
        this.f37829g = z10;
    }

    public final void a(q4.j jVar, j jVar2) {
        Context context = jVar.f43842a;
        q4.j jVar3 = this.f37823a;
        if (context == jVar3.f43842a) {
            if (jVar.f43843b != q4.l.f43868a) {
                if (jVar.f43844c == jVar3.f43844c) {
                    if (jVar.f43829A == jVar3.f43829A) {
                        if (jVar.f43830B == jVar3.f43830B) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q4.j jVar, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        i iVar;
        l lVar;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f37822j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f37822j0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f37820h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f37822j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j jVar2 = kVar.f37819Z;
                        lVar = kVar.f37818Y;
                        N.B0(obj);
                        iVar = jVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    List list = this.f37824b;
                    int i12 = this.f37825c;
                    if (i12 > 0) {
                        a(jVar, (j) list.get(i12 - 1));
                    }
                    j jVar3 = (j) list.get(i12);
                    r4.h hVar = this.f37827e;
                    f4.e eVar = this.f37828f;
                    l lVar2 = new l(this.f37823a, this.f37824b, i12 + 1, jVar, hVar, eVar, this.f37829g);
                    kVar.f37818Y = this;
                    kVar.f37819Z = jVar3;
                    kVar.f37822j0 = 1;
                    i iVar2 = (i) jVar3;
                    obj = iVar2.d(lVar2, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    lVar = this;
                    iVar = iVar2;
                }
                q4.k kVar2 = (q4.k) obj;
                lVar.a(kVar2.b(), iVar);
                return kVar2;
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj2 = kVar.f37820h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f37822j0;
        if (i10 == 0) {
        }
        q4.k kVar22 = (q4.k) obj2;
        lVar.a(kVar22.b(), iVar);
        return kVar22;
    }
}
