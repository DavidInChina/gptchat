package v2;

import android.content.Context;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class n implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f47107a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f47108b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5969h f47109c;

    /* renamed from: d  reason: collision with root package name */
    public u f47110d;

    /* renamed from: e  reason: collision with root package name */
    public C5963b f47111e;

    /* renamed from: f  reason: collision with root package name */
    public C5966e f47112f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC5969h f47113g;

    /* renamed from: h  reason: collision with root package name */
    public H f47114h;

    /* renamed from: i  reason: collision with root package name */
    public C5967f f47115i;

    /* renamed from: j  reason: collision with root package name */
    public C f47116j;

    /* renamed from: k  reason: collision with root package name */
    public AbstractC5969h f47117k;

    public n(Context context, AbstractC5969h abstractC5969h) {
        this.f47107a = context.getApplicationContext();
        abstractC5969h.getClass();
        this.f47109c = abstractC5969h;
    }

    public static void q(AbstractC5969h abstractC5969h, F f6) {
        if (abstractC5969h != null) {
            abstractC5969h.g(f6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [v2.h, v2.f, v2.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [v2.h, v2.u, v2.c] */
    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        boolean z10;
        if (this.f47117k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        String scheme = lVar.f47095a.getScheme();
        int i10 = AbstractC5530A.f45131a;
        Uri uri = lVar.f47095a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f47107a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f47111e == null) {
                    C5963b c5963b = new C5963b(context);
                    this.f47111e = c5963b;
                    p(c5963b);
                }
                this.f47117k = this.f47111e;
            } else if ("content".equals(scheme)) {
                if (this.f47112f == null) {
                    C5966e c5966e = new C5966e(context);
                    this.f47112f = c5966e;
                    p(c5966e);
                }
                this.f47117k = this.f47112f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                AbstractC5969h abstractC5969h = this.f47109c;
                if (equals) {
                    if (this.f47113g == null) {
                        try {
                            AbstractC5969h abstractC5969h2 = (AbstractC5969h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.f47113g = abstractC5969h2;
                            p(abstractC5969h2);
                        } catch (ClassNotFoundException unused) {
                            s2.p.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.f47113g == null) {
                            this.f47113g = abstractC5969h;
                        }
                    }
                    this.f47117k = this.f47113g;
                } else if (ParameterNames.UDP.equals(scheme)) {
                    if (this.f47114h == null) {
                        H h10 = new H();
                        this.f47114h = h10;
                        p(h10);
                    }
                    this.f47117k = this.f47114h;
                } else if ("data".equals(scheme)) {
                    if (this.f47115i == null) {
                        ?? abstractC5964c = new AbstractC5964c(false);
                        this.f47115i = abstractC5964c;
                        p(abstractC5964c);
                    }
                    this.f47117k = this.f47115i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f47117k = abstractC5969h;
                } else {
                    if (this.f47116j == null) {
                        C c10 = new C(context);
                        this.f47116j = c10;
                        p(c10);
                    }
                    this.f47117k = this.f47116j;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f47111e == null) {
                    C5963b c5963b2 = new C5963b(context);
                    this.f47111e = c5963b2;
                    p(c5963b2);
                }
                this.f47117k = this.f47111e;
            } else {
                if (this.f47110d == null) {
                    ?? abstractC5964c2 = new AbstractC5964c(false);
                    this.f47110d = abstractC5964c2;
                    p(abstractC5964c2);
                }
                this.f47117k = this.f47110d;
            }
        }
        return this.f47117k.a(lVar);
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        AbstractC5969h abstractC5969h = this.f47117k;
        if (abstractC5969h != null) {
            try {
                abstractC5969h.close();
            } finally {
                this.f47117k = null;
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
        f6.getClass();
        this.f47109c.g(f6);
        this.f47108b.add(f6);
        q(this.f47110d, f6);
        q(this.f47111e, f6);
        q(this.f47112f, f6);
        q(this.f47113g, f6);
        q(this.f47114h, f6);
        q(this.f47115i, f6);
        q(this.f47116j, f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        AbstractC5969h abstractC5969h = this.f47117k;
        if (abstractC5969h == null) {
            return null;
        }
        return abstractC5969h.getUri();
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        AbstractC5969h abstractC5969h = this.f47117k;
        if (abstractC5969h == null) {
            return Collections.emptyMap();
        }
        return abstractC5969h.j();
    }

    public final void p(AbstractC5969h abstractC5969h) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47108b;
            if (i10 < arrayList.size()) {
                abstractC5969h.g((F) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC5969h abstractC5969h = this.f47117k;
        abstractC5969h.getClass();
        return abstractC5969h.read(bArr, i10, i11);
    }
}
