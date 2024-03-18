package p;

import android.content.Context;
import android.view.MenuItem;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.C3963m;
import w.C6049A;
import w1.AbstractMenuItemC6082b;

/* renamed from: p.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5028d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41549a;

    /* renamed from: b  reason: collision with root package name */
    public Object f41550b;

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f41551c;

    public AbstractC5028d(x3.y yVar) {
        AbstractC3557B.c0("database", yVar);
        this.f41549a = yVar;
        this.f41550b = new AtomicBoolean(false);
        this.f41551c = R4.b.D1(new X0.b(9, this));
    }

    public final B3.i c() {
        ((x3.y) this.f41549a).a();
        if (((AtomicBoolean) this.f41550b).compareAndSet(false, true)) {
            return (B3.i) this.f41551c.getValue();
        }
        return d();
    }

    public final B3.i d() {
        String e10 = e();
        x3.y yVar = (x3.y) this.f41549a;
        yVar.getClass();
        yVar.a();
        yVar.b();
        return yVar.g().getWritableDatabase().x(e10);
    }

    public abstract String e();

    public final MenuItem f(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC6082b) {
            AbstractMenuItemC6082b abstractMenuItemC6082b = (AbstractMenuItemC6082b) menuItem;
            if (((C6049A) this.f41550b) == null) {
                this.f41550b = new C6049A();
            }
            MenuItem menuItem2 = (MenuItem) ((C6049A) this.f41550b).get(abstractMenuItemC6082b);
            if (menuItem2 == null) {
                w wVar = new w((Context) this.f41549a, abstractMenuItemC6082b);
                ((C6049A) this.f41550b).put(abstractMenuItemC6082b, wVar);
                return wVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final void g(B3.i iVar) {
        AbstractC3557B.c0("statement", iVar);
        if (iVar == ((B3.i) this.f41551c.getValue())) {
            ((AtomicBoolean) this.f41550b).set(false);
        }
    }

    public AbstractC5028d(Context context) {
        this.f41549a = context;
    }
}
