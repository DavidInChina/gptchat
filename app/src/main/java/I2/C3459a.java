package i2;

import X1.h;
import X1.k;
import X1.m;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: i2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3459a implements h {

    /* renamed from: c  reason: collision with root package name */
    public C3464f f32594c;

    /* renamed from: a  reason: collision with root package name */
    public m f32592a = k.f21752b;

    /* renamed from: b  reason: collision with root package name */
    public String f32593b = "";

    /* renamed from: d  reason: collision with root package name */
    public int f32595d = Integer.MAX_VALUE;

    @Override // X1.h
    public final h a() {
        C3459a c3459a = new C3459a();
        c3459a.f32592a = this.f32592a;
        c3459a.f32593b = this.f32593b;
        c3459a.f32594c = this.f32594c;
        c3459a.f32595d = this.f32595d;
        return c3459a;
    }

    @Override // X1.h
    public final void b(m mVar) {
        this.f32592a = mVar;
    }

    @Override // X1.h
    public final m c() {
        return this.f32592a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmittableText(");
        sb2.append(this.f32593b);
        sb2.append(", style=");
        sb2.append(this.f32594c);
        sb2.append(", modifier=");
        sb2.append(this.f32592a);
        sb2.append(", maxLines=");
        return AbstractC2469q0.j(sb2, this.f32595d, ')');
    }
}
