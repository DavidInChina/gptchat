package s3;

import android.app.Activity;
import android.content.Context;
import id.AbstractC3557B;
import java.util.Iterator;
import kotlin.Metadata;

@V("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Ls3/c;", "Ls3/W;", "Ls3/a;", "B2/u", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s3.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5553c extends W {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f45292c;

    public C5553c(Context context) {
        Object obj;
        AbstractC3557B.c0("context", context);
        Iterator it = Kg.p.c1(context, C5552b.f45281Z).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f45292c = (Activity) obj;
    }

    @Override // s3.W
    public final AbstractC5540C a() {
        return new AbstractC5540C(this);
    }

    @Override // s3.W
    public final AbstractC5540C c(AbstractC5540C abstractC5540C) {
        throw new IllegalStateException(android.gov.nist.core.a.l(new StringBuilder("Destination "), ((C5551a) abstractC5540C).f45221l0, " does not have an Intent set.").toString());
    }

    @Override // s3.W
    public final boolean f() {
        Activity activity = this.f45292c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
