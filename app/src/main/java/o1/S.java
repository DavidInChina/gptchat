package o1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.datastore.preferences.protobuf.r0;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Iterator;
import p1.AbstractC5036a;
import p1.AbstractC5042g;

/* loaded from: classes.dex */
public final class S implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40448Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f40449Z = new ArrayList();

    /* renamed from: h0  reason: collision with root package name */
    public final Object f40450h0;

    public S(Context context) {
        this.f40450h0 = context;
    }

    public final void f(ComponentName componentName) {
        Object obj = this.f40450h0;
        Object obj2 = this.f40449Z;
        int size = ((ArrayList) obj2).size();
        try {
            for (Intent u02 = r9.y.u0((Context) obj, componentName); u02 != null; u02 = r9.y.u0((Context) obj, u02.getComponent())) {
                ((ArrayList) obj2).add(size, u02);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC3612c.c("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f40448Y;
        Object obj = this.f40450h0;
        Object obj2 = this.f40449Z;
        switch (i10) {
            case 0:
                return ((ArrayList) obj2).iterator();
            case 1:
                return new r0((wi.s) obj2, (wi.s) obj, 0);
            default:
                CharSequence charSequence = (CharSequence) obj2;
                return new Ci.b(charSequence, new Ci.a((io.sentry.android.core.z) obj, charSequence));
        }
    }

    public final void r() {
        ArrayList arrayList = (ArrayList) this.f40449Z;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = AbstractC5042g.f41723a;
            AbstractC5036a.a((Context) this.f40450h0, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
