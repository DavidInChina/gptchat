package K4;

import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.C2442d;
import com.google.android.gms.internal.play_billing.C2454j;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: K4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819g {

    /* renamed from: a  reason: collision with root package name */
    public String f9426a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f9427b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9428c;

    /* renamed from: d  reason: collision with root package name */
    public f3.f f9429d;

    /* JADX WARN: Type inference failed for: r3v3, types: [K4.i, java.lang.Object] */
    public final C0821i a() {
        boolean z10;
        AbstractC2446f abstractC2446f;
        ArrayList arrayList = this.f9427b;
        boolean z11 = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C0820h c0820h = (C0820h) this.f9427b.get(0);
            for (int i10 = 0; i10 < this.f9427b.size(); i10++) {
                C0820h c0820h2 = (C0820h) this.f9427b.get(i10);
                if (c0820h2 != null) {
                    if (i10 != 0) {
                        q qVar = c0820h2.f9430a;
                        if (!qVar.f9462d.equals(c0820h.f9430a.f9462d) && !qVar.f9462d.equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            String optString = c0820h.f9430a.f9460b.optString("packageName");
            Iterator it = this.f9427b.iterator();
            while (it.hasNext()) {
                C0820h c0820h3 = (C0820h) it.next();
                if (!c0820h.f9430a.f9462d.equals("play_pass_subs") && !c0820h3.f9430a.f9462d.equals("play_pass_subs") && !optString.equals(c0820h3.f9430a.f9460b.optString("packageName"))) {
                    throw new IllegalArgumentException("All products must have the same package name.");
                }
            }
            ?? obj = new Object();
            if (!z10 || ((C0820h) this.f9427b.get(0)).f9430a.f9460b.optString("packageName").isEmpty()) {
                z11 = false;
            }
            obj.f9432a = z11;
            obj.f9433b = this.f9426a;
            obj.f9434c = null;
            obj.f9435d = this.f9429d.a();
            obj.f9437f = new ArrayList();
            obj.f9438g = this.f9428c;
            ArrayList arrayList2 = this.f9427b;
            if (arrayList2 != null) {
                abstractC2446f = AbstractC2446f.U(arrayList2);
            } else {
                C2442d c2442d = AbstractC2446f.f26919Z;
                abstractC2446f = C2454j.f26930j0;
            }
            obj.f9436e = abstractC2446f;
            return obj;
        }
        throw new IllegalArgumentException("Details of the products must be provided.");
    }
}
