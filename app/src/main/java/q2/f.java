package q2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class f implements AbstractC5264d {

    /* renamed from: b  reason: collision with root package name */
    public C5262b f43667b;

    /* renamed from: c  reason: collision with root package name */
    public C5262b f43668c;

    /* renamed from: d  reason: collision with root package name */
    public C5262b f43669d;

    /* renamed from: e  reason: collision with root package name */
    public C5262b f43670e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f43671f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f43672g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43673h;

    public f() {
        ByteBuffer byteBuffer = AbstractC5264d.f43666a;
        this.f43671f = byteBuffer;
        this.f43672g = byteBuffer;
        C5262b c5262b = C5262b.f43661e;
        this.f43669d = c5262b;
        this.f43670e = c5262b;
        this.f43667b = c5262b;
        this.f43668c = c5262b;
    }

    @Override // q2.AbstractC5264d
    public boolean a() {
        if (this.f43670e != C5262b.f43661e) {
            return true;
        }
        return false;
    }

    @Override // q2.AbstractC5264d
    public final void b() {
        flush();
        this.f43671f = AbstractC5264d.f43666a;
        C5262b c5262b = C5262b.f43661e;
        this.f43669d = c5262b;
        this.f43670e = c5262b;
        this.f43667b = c5262b;
        this.f43668c = c5262b;
        k();
    }

    @Override // q2.AbstractC5264d
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f43672g;
        this.f43672g = AbstractC5264d.f43666a;
        return byteBuffer;
    }

    @Override // q2.AbstractC5264d
    public final C5262b d(C5262b c5262b) {
        this.f43669d = c5262b;
        this.f43670e = h(c5262b);
        if (a()) {
            return this.f43670e;
        }
        return C5262b.f43661e;
    }

    @Override // q2.AbstractC5264d
    public final void f() {
        this.f43673h = true;
        j();
    }

    @Override // q2.AbstractC5264d
    public final void flush() {
        this.f43672g = AbstractC5264d.f43666a;
        this.f43673h = false;
        this.f43667b = this.f43669d;
        this.f43668c = this.f43670e;
        i();
    }

    @Override // q2.AbstractC5264d
    public boolean g() {
        if (this.f43673h && this.f43672g == AbstractC5264d.f43666a) {
            return true;
        }
        return false;
    }

    public abstract C5262b h(C5262b c5262b);

    public final ByteBuffer l(int i10) {
        if (this.f43671f.capacity() < i10) {
            this.f43671f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f43671f.clear();
        }
        ByteBuffer byteBuffer = this.f43671f;
        this.f43672g = byteBuffer;
        return byteBuffer;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
