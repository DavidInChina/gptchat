package q2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class h implements AbstractC5264d {

    /* renamed from: b  reason: collision with root package name */
    public int f43696b;

    /* renamed from: c  reason: collision with root package name */
    public float f43697c;

    /* renamed from: d  reason: collision with root package name */
    public float f43698d;

    /* renamed from: e  reason: collision with root package name */
    public C5262b f43699e;

    /* renamed from: f  reason: collision with root package name */
    public C5262b f43700f;

    /* renamed from: g  reason: collision with root package name */
    public C5262b f43701g;

    /* renamed from: h  reason: collision with root package name */
    public C5262b f43702h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f43703i;

    /* renamed from: j  reason: collision with root package name */
    public g f43704j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f43705k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f43706l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f43707m;

    /* renamed from: n  reason: collision with root package name */
    public long f43708n;

    /* renamed from: o  reason: collision with root package name */
    public long f43709o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f43710p;

    @Override // q2.AbstractC5264d
    public final boolean a() {
        if (this.f43700f.f43662a != -1 && (Math.abs(this.f43697c - 1.0f) >= 1.0E-4f || Math.abs(this.f43698d - 1.0f) >= 1.0E-4f || this.f43700f.f43662a != this.f43699e.f43662a)) {
            return true;
        }
        return false;
    }

    @Override // q2.AbstractC5264d
    public final void b() {
        this.f43697c = 1.0f;
        this.f43698d = 1.0f;
        C5262b c5262b = C5262b.f43661e;
        this.f43699e = c5262b;
        this.f43700f = c5262b;
        this.f43701g = c5262b;
        this.f43702h = c5262b;
        ByteBuffer byteBuffer = AbstractC5264d.f43666a;
        this.f43705k = byteBuffer;
        this.f43706l = byteBuffer.asShortBuffer();
        this.f43707m = byteBuffer;
        this.f43696b = -1;
        this.f43703i = false;
        this.f43704j = null;
        this.f43708n = 0L;
        this.f43709o = 0L;
        this.f43710p = false;
    }

    @Override // q2.AbstractC5264d
    public final ByteBuffer c() {
        g gVar = this.f43704j;
        if (gVar != null) {
            int i10 = gVar.f43686m;
            int i11 = gVar.f43675b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f43705k.capacity() < i12) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f43705k = order;
                    this.f43706l = order.asShortBuffer();
                } else {
                    this.f43705k.clear();
                    this.f43706l.clear();
                }
                ShortBuffer shortBuffer = this.f43706l;
                int min = Math.min(shortBuffer.remaining() / i11, gVar.f43686m);
                int i13 = min * i11;
                shortBuffer.put(gVar.f43685l, 0, i13);
                int i14 = gVar.f43686m - min;
                gVar.f43686m = i14;
                short[] sArr = gVar.f43685l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f43709o += i12;
                this.f43705k.limit(i12);
                this.f43707m = this.f43705k;
            }
        }
        ByteBuffer byteBuffer = this.f43707m;
        this.f43707m = AbstractC5264d.f43666a;
        return byteBuffer;
    }

    @Override // q2.AbstractC5264d
    public final C5262b d(C5262b c5262b) {
        if (c5262b.f43664c == 2) {
            int i10 = this.f43696b;
            if (i10 == -1) {
                i10 = c5262b.f43662a;
            }
            this.f43699e = c5262b;
            C5262b c5262b2 = new C5262b(i10, c5262b.f43663b, 2);
            this.f43700f = c5262b2;
            this.f43703i = true;
            return c5262b2;
        }
        throw new C5263c(c5262b);
    }

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        g gVar = this.f43704j;
        gVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f43708n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = gVar.f43675b;
        int i11 = remaining2 / i10;
        short[] c10 = gVar.c(gVar.f43683j, gVar.f43684k, i11);
        gVar.f43683j = c10;
        asShortBuffer.get(c10, gVar.f43684k * i10, ((i11 * i10) * 2) / 2);
        gVar.f43684k += i11;
        gVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // q2.AbstractC5264d
    public final void f() {
        g gVar = this.f43704j;
        if (gVar != null) {
            int i10 = gVar.f43684k;
            float f6 = gVar.f43676c;
            float f10 = gVar.f43677d;
            int i11 = gVar.f43686m + ((int) ((((i10 / (f6 / f10)) + gVar.f43688o) / (gVar.f43678e * f10)) + 0.5f));
            short[] sArr = gVar.f43683j;
            int i12 = gVar.f43681h * 2;
            gVar.f43683j = gVar.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = gVar.f43675b;
                if (i13 >= i12 * i14) {
                    break;
                }
                gVar.f43683j[(i14 * i10) + i13] = 0;
                i13++;
            }
            gVar.f43684k = i12 + gVar.f43684k;
            gVar.f();
            if (gVar.f43686m > i11) {
                gVar.f43686m = i11;
            }
            gVar.f43684k = 0;
            gVar.f43691r = 0;
            gVar.f43688o = 0;
        }
        this.f43710p = true;
    }

    @Override // q2.AbstractC5264d
    public final void flush() {
        if (a()) {
            C5262b c5262b = this.f43699e;
            this.f43701g = c5262b;
            C5262b c5262b2 = this.f43700f;
            this.f43702h = c5262b2;
            if (this.f43703i) {
                int i10 = c5262b.f43662a;
                this.f43704j = new g(this.f43697c, this.f43698d, i10, c5262b.f43663b, c5262b2.f43662a);
            } else {
                g gVar = this.f43704j;
                if (gVar != null) {
                    gVar.f43684k = 0;
                    gVar.f43686m = 0;
                    gVar.f43688o = 0;
                    gVar.f43689p = 0;
                    gVar.f43690q = 0;
                    gVar.f43691r = 0;
                    gVar.f43692s = 0;
                    gVar.f43693t = 0;
                    gVar.f43694u = 0;
                    gVar.f43695v = 0;
                }
            }
        }
        this.f43707m = AbstractC5264d.f43666a;
        this.f43708n = 0L;
        this.f43709o = 0L;
        this.f43710p = false;
    }

    @Override // q2.AbstractC5264d
    public final boolean g() {
        g gVar;
        if (this.f43710p && ((gVar = this.f43704j) == null || gVar.f43686m * gVar.f43675b * 2 == 0)) {
            return true;
        }
        return false;
    }
}
