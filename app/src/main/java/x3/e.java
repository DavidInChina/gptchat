package x3;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.D;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f48671a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48672b;

    /* renamed from: c  reason: collision with root package name */
    public final B3.e f48673c;

    /* renamed from: d  reason: collision with root package name */
    public final D f48674d;

    /* renamed from: e  reason: collision with root package name */
    public final List f48675e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f48676f;

    /* renamed from: g  reason: collision with root package name */
    public final int f48677g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f48678h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f48679i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f48680j = null;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f48681k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f48682l;

    /* renamed from: m  reason: collision with root package name */
    public final Set f48683m;

    /* renamed from: n  reason: collision with root package name */
    public final List f48684n;

    /* renamed from: o  reason: collision with root package name */
    public final List f48685o;

    public e(Context context, String str, B3.e eVar, D d10, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("migrationContainer", d10);
        AbstractC2469q0.q("journalMode", i10);
        AbstractC3557B.c0("typeConverters", arrayList2);
        AbstractC3557B.c0("autoMigrationSpecs", arrayList3);
        this.f48671a = context;
        this.f48672b = str;
        this.f48673c = eVar;
        this.f48674d = d10;
        this.f48675e = arrayList;
        this.f48676f = z10;
        this.f48677g = i10;
        this.f48678h = executor;
        this.f48679i = executor2;
        this.f48681k = z11;
        this.f48682l = z12;
        this.f48683m = linkedHashSet;
        this.f48684n = arrayList2;
        this.f48685o = arrayList3;
    }

    public final boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f48682l) || !this.f48681k) {
            return false;
        }
        Set set = this.f48683m;
        if (set != null && set.contains(Integer.valueOf(i10))) {
            return false;
        }
        return true;
    }
}
