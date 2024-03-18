package z1;

import android.content.Context;
import java.util.concurrent.Callable;
import q.r;

/* renamed from: z1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC6745d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f51440a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f51441b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f51442c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f51443d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f51444e;

    public /* synthetic */ CallableC6745d(String str, Context context, r rVar, int i10, int i11) {
        this.f51440a = i11;
        this.f51441b = str;
        this.f51442c = context;
        this.f51443d = rVar;
        this.f51444e = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f51441b;
        Context context = this.f51442c;
        r rVar = this.f51443d;
        int i10 = this.f51444e;
        int i11 = this.f51440a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return AbstractC6748g.a(str, context, rVar, i10);
                    default:
                        try {
                            return AbstractC6748g.a(str, context, rVar, i10);
                        } catch (Throwable unused) {
                            return new C6747f(-3);
                        }
                }
            default:
                switch (i11) {
                    case 0:
                        return AbstractC6748g.a(str, context, rVar, i10);
                    default:
                        try {
                            return AbstractC6748g.a(str, context, rVar, i10);
                        } catch (Throwable unused2) {
                            return new C6747f(-3);
                        }
                }
        }
    }
}
