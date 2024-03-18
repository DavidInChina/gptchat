package x3;

import android.content.Context;
import androidx.lifecycle.D;
import androidx.work.impl.WorkDatabase;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f48733a;

    /* renamed from: c  reason: collision with root package name */
    public final String f48735c;

    /* renamed from: g  reason: collision with root package name */
    public Executor f48739g;

    /* renamed from: h  reason: collision with root package name */
    public Executor f48740h;

    /* renamed from: i  reason: collision with root package name */
    public B3.e f48741i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f48742j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f48745m;

    /* renamed from: q  reason: collision with root package name */
    public HashSet f48749q;

    /* renamed from: b  reason: collision with root package name */
    public final Class f48734b = WorkDatabase.class;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f48736d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f48737e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f48738f = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final int f48743k = 1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f48744l = true;

    /* renamed from: n  reason: collision with root package name */
    public final long f48746n = -1;

    /* renamed from: o  reason: collision with root package name */
    public final D f48747o = new D(1);

    /* renamed from: p  reason: collision with root package name */
    public final LinkedHashSet f48748p = new LinkedHashSet();

    public x(Context context, String str) {
        this.f48733a = context;
        this.f48735c = str;
    }

    public final void a(AbstractC6540b... abstractC6540bArr) {
        if (this.f48749q == null) {
            this.f48749q = new HashSet();
        }
        for (AbstractC6540b abstractC6540b : abstractC6540bArr) {
            HashSet hashSet = this.f48749q;
            AbstractC3557B.Z(hashSet);
            hashSet.add(Integer.valueOf(abstractC6540b.f50712a));
            HashSet hashSet2 = this.f48749q;
            AbstractC3557B.Z(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC6540b.f50713b));
        }
        this.f48747o.b((AbstractC6540b[]) Arrays.copyOf(abstractC6540bArr, abstractC6540bArr.length));
    }
}
