package j1;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public final m f35978d;

    /* renamed from: f  reason: collision with root package name */
    public int f35980f;

    /* renamed from: g  reason: collision with root package name */
    public int f35981g;

    /* renamed from: a  reason: collision with root package name */
    public m f35975a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35976b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35977c = false;

    /* renamed from: e  reason: collision with root package name */
    public int f35979e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f35982h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f35983i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f35984j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f35985k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f35986l = new ArrayList();

    public f(m mVar) {
        this.f35978d = mVar;
    }

    @Override // j1.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f35986l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f35984j) {
                return;
            }
        }
        this.f35977c = true;
        m mVar = this.f35975a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f35976b) {
            this.f35978d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f35984j) {
            g gVar = this.f35983i;
            if (gVar != null) {
                if (gVar.f35984j) {
                    this.f35980f = this.f35982h * gVar.f35981g;
                } else {
                    return;
                }
            }
            d(fVar.f35981g + this.f35980f);
        }
        m mVar2 = this.f35975a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f35985k.add(dVar);
        if (this.f35984j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f35986l.clear();
        this.f35985k.clear();
        this.f35984j = false;
        this.f35981g = 0;
        this.f35977c = false;
        this.f35976b = false;
    }

    public void d(int i10) {
        if (this.f35984j) {
            return;
        }
        this.f35984j = true;
        this.f35981g = i10;
        Iterator it = this.f35985k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35978d.f35994b.f32482W);
        sb2.append(":");
        sb2.append(AbstractC2469q0.A(this.f35979e));
        sb2.append(Separators.LPAREN);
        if (this.f35984j) {
            obj = Integer.valueOf(this.f35981g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f35986l.size());
        sb2.append(":d=");
        sb2.append(this.f35985k.size());
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
