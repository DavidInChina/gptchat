package ne;

import id.AbstractC3557B;
import java.io.Closeable;
import wf.k;

/* renamed from: ne.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4820d implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f40299Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f40300Z;

    /* renamed from: h0  reason: collision with root package name */
    public final k f40301h0;

    /* renamed from: i0  reason: collision with root package name */
    public C4818b f40302i0 = C4818b.f40294Z;

    public C4820d(Object obj, String str, k kVar) {
        AbstractC3557B.c0("config", obj);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("body", kVar);
        this.f40299Y = obj;
        this.f40300Z = str;
        this.f40301h0 = kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40302i0.getClass();
    }
}
