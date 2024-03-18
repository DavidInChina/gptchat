package androidx.appcompat.view;

import U3.u;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import l.AbstractC4308a;
import org.xmlpull.v1.XmlPullParserException;
import p.r;
import q.AbstractC5238u0;
import w1.AbstractMenuC6081a;

/* loaded from: classes.dex */
public final class k extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f24402e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f24403f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f24404a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f24405b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f24406c;

    /* renamed from: d  reason: collision with root package name */
    public Object f24407d;

    static {
        Class[] clsArr = {Context.class};
        f24402e = clsArr;
        f24403f = clsArr;
    }

    public k(Context context) {
        super(context);
        this.f24406c = context;
        Object[] objArr = {context};
        this.f24404a = objArr;
        this.f24405b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char c10;
        char c11;
        boolean z10;
        ColorStateList colorStateList;
        j jVar = new j(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                            z11 = z11;
                            z12 = z12;
                        } else if (name2.equals("group")) {
                            jVar.f24377b = 0;
                            jVar.f24378c = 0;
                            jVar.f24379d = 0;
                            jVar.f24380e = 0;
                            jVar.f24381f = true;
                            jVar.f24382g = true;
                        } else if (name2.equals("item")) {
                            if (!jVar.f24383h) {
                                r rVar = jVar.f24401z;
                                if (rVar != null && rVar.f41661a.hasSubMenu()) {
                                    jVar.f24383h = true;
                                    jVar.b(jVar.f24376a.addSubMenu(jVar.f24377b, jVar.f24384i, jVar.f24385j, jVar.f24386k).getItem());
                                } else {
                                    jVar.f24383h = true;
                                    jVar.b(jVar.f24376a.add(jVar.f24377b, jVar.f24384i, jVar.f24385j, jVar.f24386k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z11 = true;
                        }
                    }
                    z11 = z11;
                } else {
                    if (!z12) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        k kVar = jVar.f24375E;
                        if (equals) {
                            TypedArray obtainStyledAttributes = kVar.f24406c.obtainStyledAttributes(attributeSet, AbstractC4308a.f37679p);
                            jVar.f24377b = obtainStyledAttributes.getResourceId(1, 0);
                            jVar.f24378c = obtainStyledAttributes.getInt(3, 0);
                            jVar.f24379d = obtainStyledAttributes.getInt(4, 0);
                            jVar.f24380e = obtainStyledAttributes.getInt(5, 0);
                            jVar.f24381f = obtainStyledAttributes.getBoolean(2, true);
                            jVar.f24382g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = kVar.f24406c;
                                u uVar = new u(context, context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37680q));
                                jVar.f24384i = uVar.z(2, 0);
                                jVar.f24385j = (uVar.x(5, jVar.f24378c) & (-65536)) | (uVar.x(6, jVar.f24379d) & 65535);
                                jVar.f24386k = uVar.C(7);
                                jVar.f24387l = uVar.C(8);
                                jVar.f24388m = uVar.z(0, 0);
                                String A10 = uVar.A(9);
                                if (A10 == null) {
                                    c10 = 0;
                                } else {
                                    c10 = A10.charAt(0);
                                }
                                jVar.f24389n = c10;
                                jVar.f24390o = uVar.x(16, 4096);
                                String A11 = uVar.A(10);
                                if (A11 == null) {
                                    c11 = 0;
                                } else {
                                    c11 = A11.charAt(0);
                                }
                                jVar.f24391p = c11;
                                jVar.f24392q = uVar.x(20, 4096);
                                if (uVar.E(11)) {
                                    jVar.f24393r = uVar.o(11, false) ? 1 : 0;
                                } else {
                                    jVar.f24393r = jVar.f24380e;
                                }
                                jVar.f24394s = uVar.o(3, false);
                                jVar.f24395t = uVar.o(4, jVar.f24381f);
                                jVar.f24396u = uVar.o(1, jVar.f24382g);
                                jVar.f24397v = uVar.x(21, -1);
                                jVar.f24400y = uVar.A(12);
                                jVar.f24398w = uVar.z(13, 0);
                                jVar.f24399x = uVar.A(15);
                                String A12 = uVar.A(14);
                                if (A12 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && jVar.f24398w == 0 && jVar.f24399x == null) {
                                    jVar.f24401z = (r) jVar.a(A12, f24403f, kVar.f24405b);
                                } else {
                                    if (z10) {
                                        AbstractC3612c.r("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    jVar.f24401z = null;
                                }
                                jVar.f24371A = uVar.C(17);
                                jVar.f24372B = uVar.C(22);
                                if (uVar.E(19)) {
                                    jVar.f24374D = AbstractC5238u0.b(uVar.x(19, -1), jVar.f24374D);
                                    colorStateList = null;
                                } else {
                                    colorStateList = null;
                                    jVar.f24374D = null;
                                }
                                if (uVar.E(18)) {
                                    jVar.f24373C = uVar.p(18);
                                } else {
                                    jVar.f24373C = colorStateList;
                                }
                                uVar.N();
                                jVar.f24383h = false;
                            } else if (name3.equals("menu")) {
                                jVar.f24383h = true;
                                SubMenu addSubMenu = jVar.f24376a.addSubMenu(jVar.f24377b, jVar.f24384i, jVar.f24385j, jVar.f24386k);
                                jVar.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                            z11 = z11;
                            z12 = z12;
                        }
                    }
                    z11 = z11;
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof AbstractMenuC6081a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f24406c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
