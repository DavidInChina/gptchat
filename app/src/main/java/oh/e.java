package Oh;

import androidx.lifecycle.D;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends Ph.a {

    /* renamed from: Y  reason: collision with root package name */
    public final Ph.a f13766Y;

    /* renamed from: Z  reason: collision with root package name */
    public final D f13767Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f13768h0 = new ArrayList();

    public e(Ph.b bVar, D d10) {
        super(589824);
        this.f13766Y = bVar;
        this.f13767Z = d10;
    }

    @Override // Ph.a
    public final Ph.a a() {
        this.f13766Y.a();
        return this;
    }

    @Override // Ph.a
    public final void b(char c10) {
        this.f13766Y.b(c10);
    }

    @Override // Ph.a
    public final Ph.a c() {
        this.f13766Y.c();
        return this;
    }

    @Override // Ph.a
    public final void e(String str) {
        this.f13768h0.add(str);
        this.f13766Y.e(this.f13767Z.j(str));
    }

    @Override // Ph.a
    public final void f() {
        this.f13766Y.f();
        ArrayList arrayList = this.f13768h0;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // Ph.a
    public final Ph.a g() {
        this.f13766Y.g();
        return this;
    }

    @Override // Ph.a
    public final void h(String str) {
        this.f13766Y.h(str);
    }

    @Override // Ph.a
    public final void i(String str) {
        int i10;
        ArrayList arrayList = this.f13768h0;
        String str2 = (String) arrayList.remove(arrayList.size() - 1);
        String str3 = str2 + '$' + str;
        arrayList.add(str3);
        StringBuilder sb2 = new StringBuilder();
        D d10 = this.f13767Z;
        sb2.append(d10.j(str2));
        sb2.append('$');
        String sb3 = sb2.toString();
        String j6 = d10.j(str3);
        if (j6.startsWith(sb3)) {
            i10 = sb3.length();
        } else {
            i10 = j6.lastIndexOf(36) + 1;
        }
        this.f13766Y.i(j6.substring(i10));
    }

    @Override // Ph.a
    public final Ph.a j() {
        this.f13766Y.j();
        return this;
    }

    @Override // Ph.a
    public final Ph.a k() {
        this.f13766Y.k();
        return this;
    }

    @Override // Ph.a
    public final Ph.a l() {
        this.f13766Y.l();
        return this;
    }

    @Override // Ph.a
    public final Ph.a m() {
        this.f13766Y.m();
        return this;
    }

    @Override // Ph.a
    public final Ph.a n() {
        this.f13766Y.n();
        return this;
    }

    @Override // Ph.a
    public final Ph.a o(char c10) {
        this.f13766Y.o(c10);
        return this;
    }

    @Override // Ph.a
    public final void p() {
        this.f13766Y.p();
    }

    @Override // Ph.a
    public final void q(String str) {
        this.f13766Y.q(str);
    }
}
