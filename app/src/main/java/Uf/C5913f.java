package uf;

import id.AbstractC3557B;
import java.io.File;
import java.util.ArrayDeque;
import kf.AbstractC4277b;
import kf.EnumC4275K;

/* renamed from: uf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5913f extends AbstractC4277b {

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayDeque f46754h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5915h f46755i0;

    public C5913f(C5915h c5915h) {
        this.f46755i0 = c5915h;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f46754h0 = arrayDeque;
        if (c5915h.f46757a.isDirectory()) {
            arrayDeque.push(b(c5915h.f46757a));
        } else if (c5915h.f46757a.isFile()) {
            File file = c5915h.f46757a;
            AbstractC3557B.c0("rootFile", file);
            arrayDeque.push(new AbstractC5914g(file));
        } else {
            this.f37465Y = EnumC4275K.f37462h0;
        }
    }

    @Override // kf.AbstractC4277b
    public final void a() {
        File file;
        File a5;
        while (true) {
            ArrayDeque arrayDeque = this.f46754h0;
            AbstractC5914g abstractC5914g = (AbstractC5914g) arrayDeque.peek();
            if (abstractC5914g == null) {
                file = null;
                break;
            }
            a5 = abstractC5914g.a();
            if (a5 == null) {
                arrayDeque.pop();
            } else if (AbstractC3557B.K(a5, abstractC5914g.f46756a) || !a5.isDirectory() || arrayDeque.size() >= this.f46755i0.f46759c) {
                break;
            } else {
                arrayDeque.push(b(a5));
            }
        }
        file = a5;
        if (file != null) {
            this.f37466Z = file;
            this.f37465Y = EnumC4275K.f37460Y;
            return;
        }
        this.f37465Y = EnumC4275K.f37462h0;
    }

    public final AbstractC5909b b(File file) {
        int ordinal = this.f46755i0.f46758b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new C5910c(this, file);
            }
            throw new RuntimeException();
        }
        return new C5912e(this, file);
    }
}
