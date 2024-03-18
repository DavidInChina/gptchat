package s2;

import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C4507D;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static s f45180e;

    /* renamed from: a  reason: collision with root package name */
    public int f45181a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f45182b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f45183c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f45184d;

    /* JADX WARN: Type inference failed for: r10v2, types: [U3.e, java.lang.Object] */
    public s(String str, String... strArr) {
        String str2;
        int i10 = 2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(Separators.COMMA);
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f45183c = str2;
        this.f45182b = str;
        ?? obj = new Object();
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            obj.f17400Y = str;
            obj.f17401Z = null;
            this.f45184d = obj;
            while (i10 <= 7 && !Log.isLoggable((String) this.f45182b, i10)) {
                i10++;
            }
            this.f45181a = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public static void a(int i10, s sVar) {
        synchronized (sVar.f45184d) {
            try {
                if (sVar.f45181a != i10) {
                    sVar.f45181a = i10;
                    Iterator it = ((CopyOnWriteArrayList) sVar.f45183c).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        I2.e eVar = (I2.e) weakReference.get();
                        if (eVar != null) {
                            eVar.a(i10);
                        } else {
                            ((CopyOnWriteArrayList) sVar.f45183c).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized s c(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (f45180e == null) {
                    f45180e = new s(context);
                }
                sVar = f45180e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final void b(String str, Object... objArr) {
        if (this.f45181a <= 3) {
            String str2 = (String) this.f45182b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.f45183c).concat(str));
        }
    }

    public final int d() {
        int i10;
        synchronized (this.f45184d) {
            i10 = this.f45181a;
        }
        return i10;
    }

    public s(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List list;
        this.f45181a = i10;
        this.f45182b = str;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.f45183c = list;
        this.f45184d = bArr;
    }

    public s(Context context) {
        this.f45182b = new Handler(Looper.getMainLooper());
        this.f45183c = new CopyOnWriteArrayList();
        this.f45184d = new Object();
        this.f45181a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C4507D(this), intentFilter);
    }

    public s(int i10, AbstractC4831k abstractC4831k, EnumC1170c enumC1170c, AbstractC1206i abstractC1206i) {
        this.f45182b = abstractC1206i;
        this.f45181a = i10;
        this.f45183c = enumC1170c;
        this.f45184d = abstractC4831k;
    }
}
