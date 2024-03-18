package y4;

import android.graphics.Color;
import s3.z;
import w4.C6119a;

/* loaded from: classes2.dex */
public final class g implements AbstractC6541a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6541a f50727a;

    /* renamed from: b  reason: collision with root package name */
    public final e f50728b;

    /* renamed from: c  reason: collision with root package name */
    public final h f50729c;

    /* renamed from: d  reason: collision with root package name */
    public final h f50730d;

    /* renamed from: e  reason: collision with root package name */
    public final h f50731e;

    /* renamed from: f  reason: collision with root package name */
    public final h f50732f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f50733g = true;

    public g(AbstractC6541a abstractC6541a, E4.b bVar, z zVar) {
        this.f50727a = abstractC6541a;
        e s10 = ((C4.a) zVar.f45394a).s();
        this.f50728b = s10;
        s10.a(this);
        bVar.d(s10);
        e s11 = ((C4.b) zVar.f45395b).s();
        this.f50729c = (h) s11;
        s11.a(this);
        bVar.d(s11);
        e s12 = ((C4.b) zVar.f45396c).s();
        this.f50730d = (h) s12;
        s12.a(this);
        bVar.d(s12);
        e s13 = ((C4.b) zVar.f45397d).s();
        this.f50731e = (h) s13;
        s13.a(this);
        bVar.d(s13);
        e s14 = ((C4.b) zVar.f45398e).s();
        this.f50732f = (h) s14;
        s14.a(this);
        bVar.d(s14);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f50733g = true;
        this.f50727a.a();
    }

    public final void b(C6119a c6119a) {
        if (!this.f50733g) {
            return;
        }
        this.f50733g = false;
        double floatValue = ((Float) this.f50730d.d()).floatValue() * 0.017453292519943295d;
        float floatValue2 = ((Float) this.f50731e.d()).floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.f50728b.d()).intValue();
        c6119a.setShadowLayer(((Float) this.f50732f.d()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f50729c.d()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }
}
