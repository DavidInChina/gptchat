package u5;

import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kf.v;
import kf.w;
import p5.AbstractC5091c;
import q5.C5271a;
import q5.C5274d;
import r5.AbstractC5366a;
import r5.AbstractC5367b;
import r5.AbstractC5368c;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final j f46442a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final q5.f f46443b;

    /* JADX WARN: Type inference failed for: r0v0, types: [u5.j, java.lang.Object] */
    static {
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f46443b = new q5.f(timeUnit.toNanos(currentTimeMillis), timeUnit.toNanos(currentTimeMillis), 0L, 0L);
    }

    @Override // r5.d
    public final Map a(String str) {
        return w.f37484Y;
    }

    @Override // r5.d
    public final void b(String str, AbstractC5367b abstractC5367b) {
        AbstractC3557B.c0("featureName", str);
        AbstractC3557B.c0("receiver", abstractC5367b);
    }

    @Override // u5.g
    public final List c() {
        return v.f37483Y;
    }

    @Override // u5.g
    public final C5274d d() {
        return new C5274d(12, null, null, null, null, null, null, 126);
    }

    @Override // u5.g
    public final boolean e() {
        return false;
    }

    @Override // r5.d
    public final void f(String str) {
        AbstractC3557B.c0("featureName", str);
    }

    @Override // p5.AbstractC5092d
    public final String g() {
        return "";
    }

    @Override // p5.AbstractC5092d
    public final String getName() {
        return "no-op";
    }

    @Override // p5.AbstractC5092d
    public final q5.f getTime() {
        return f46443b;
    }

    @Override // r5.d
    public final AbstractC5368c h(String str) {
        AbstractC3557B.c0("featureName", str);
        return null;
    }

    @Override // r5.d
    public final AbstractC5091c l() {
        return new k(this);
    }

    @Override // u5.g
    public final D5.a m() {
        return new D5.a(w.f37484Y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // u5.g
    public final ExecutorService n() {
        return new Object();
    }

    @Override // u5.g
    public final C5271a o() {
        return null;
    }

    @Override // r5.d
    public final void i(AbstractC5366a abstractC5366a) {
    }

    @Override // u5.g
    public final void k(byte[] bArr) {
    }

    @Override // r5.d
    public final void j(String str, wf.k kVar) {
    }

    @Override // p5.AbstractC5092d
    public final void p(String str, String str2, String str3, Map map) {
    }
}
