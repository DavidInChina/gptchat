package pa;

import Ja.r;
import android.app.Application;
import com.openai.experiment.t;
import d1.C2571f;
import d9.h;
import jf.C3963m;
import ld.C4429b;
import ld.q;
import nd.C4812a;

/* renamed from: pa.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5108d implements r {

    /* renamed from: a  reason: collision with root package name */
    public final C4812a f42862a;

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f42863b = R4.b.D1(new h(10, this));

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f42864c;

    public C5108d(Application application, C4812a c4812a, C4429b c4429b, q qVar, t tVar) {
        this.f42862a = c4812a;
        this.f42864c = R4.b.D1(new C2571f(this, application, c4429b, qVar, tVar, 1));
    }
}
