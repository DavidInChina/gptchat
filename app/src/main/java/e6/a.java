package E6;

import A.C0007a0;
import F6.c;
import R4.b;
import android.content.Context;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.C3963m;
import p5.AbstractC5091c;
import r5.d;
import r5.e;
import s5.AbstractC5577b;
import t5.C5677c;

/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final d f4537a;

    /* renamed from: b  reason: collision with root package name */
    public final R4.a f4538b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4539c;

    /* renamed from: g  reason: collision with root package name */
    public final C3963m f4543g;

    /* renamed from: d  reason: collision with root package name */
    public U6.a f4540d = new F6.a(0);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4541e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final String f4542f = "tracing";

    /* renamed from: h  reason: collision with root package name */
    public final C5677c f4544h = C5677c.f45749a;

    public a(d dVar, String str, R4.a aVar, boolean z10) {
        AbstractC3557B.c0("spanEventMapper", aVar);
        this.f4537a = dVar;
        this.f4538b = aVar;
        this.f4539c = z10;
        this.f4543g = b.D1(new C0007a0(str, 27, this));
    }

    @Override // r5.e
    public final C5677c a() {
        return this.f4544h;
    }

    @Override // r5.AbstractC5366a
    public final void c() {
        this.f4540d = new F6.a(0);
        this.f4541e.set(false);
    }

    @Override // r5.e
    public final AbstractC5577b d() {
        return (AbstractC5577b) this.f4543g.getValue();
    }

    @Override // r5.AbstractC5366a
    public final void e(Context context) {
        d dVar = this.f4537a;
        AbstractC5091c l10 = dVar.l();
        this.f4540d = new c(dVar, new G6.a(this.f4539c), new G6.b(this.f4538b, l10), new G6.c(l10), l10);
        this.f4541e.set(true);
    }

    @Override // r5.AbstractC5366a
    public final String getName() {
        return this.f4542f;
    }
}
