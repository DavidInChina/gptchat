package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.statsig.androidsdk.StatsigLoggerKt;
import f1.AbstractC2933a;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r9.y;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f36940d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f36941e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f36942a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f36943b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f36944c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f36941e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(C4153a c4153a, String str) {
        int i10;
        HashMap hashMap;
        String[] split = str.split(Separators.COMMA);
        Context context = c4153a.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Object obj = null;
            try {
                i10 = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, ParameterNames.ID, context.getPackageName());
            }
            if (i10 == 0 && c4153a.isInEditMode() && (c4153a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c4153a.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f24882t0) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f24882t0.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i10 = ((Integer) obj).intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static i d(Context context, AttributeSet attributeSet) {
        SparseIntArray sparseIntArray;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f36945a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            l lVar = iVar.f36855b;
            k kVar = iVar.f36856c;
            m mVar = iVar.f36858e;
            j jVar = iVar.f36857d;
            if (index != 1 && 23 != index && 24 != index) {
                kVar.getClass();
                jVar.getClass();
                lVar.getClass();
                mVar.getClass();
            }
            switch (f36941e.get(index)) {
                case 1:
                    jVar.f36906o = f(obtainStyledAttributes, index, jVar.f36906o);
                    break;
                case 2:
                    jVar.f36866F = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36866F);
                    break;
                case 3:
                    jVar.f36905n = f(obtainStyledAttributes, index, jVar.f36905n);
                    break;
                case 4:
                    jVar.f36904m = f(obtainStyledAttributes, index, jVar.f36904m);
                    break;
                case 5:
                    jVar.f36913v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    jVar.f36917z = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f36917z);
                    break;
                case 7:
                    jVar.f36861A = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f36861A);
                    break;
                case 8:
                    jVar.f36867G = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36867G);
                    break;
                case 9:
                    jVar.f36910s = f(obtainStyledAttributes, index, jVar.f36910s);
                    break;
                case 10:
                    jVar.f36909r = f(obtainStyledAttributes, index, jVar.f36909r);
                    break;
                case 11:
                    jVar.f36872L = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36872L);
                    break;
                case 12:
                    jVar.f36873M = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36873M);
                    break;
                case 13:
                    jVar.f36869I = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36869I);
                    break;
                case 14:
                    jVar.f36871K = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36871K);
                    break;
                case 15:
                    jVar.f36874N = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36874N);
                    break;
                case 16:
                    jVar.f36870J = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36870J);
                    break;
                case 17:
                    jVar.f36889d = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f36889d);
                    break;
                case 18:
                    jVar.f36891e = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f36891e);
                    break;
                case 19:
                    jVar.f36893f = obtainStyledAttributes.getFloat(index, jVar.f36893f);
                    break;
                case 20:
                    jVar.f36911t = obtainStyledAttributes.getFloat(index, jVar.f36911t);
                    break;
                case 21:
                    jVar.f36887c = obtainStyledAttributes.getLayoutDimension(index, jVar.f36887c);
                    break;
                case 22:
                    lVar.f36923a = f36940d[obtainStyledAttributes.getInt(index, lVar.f36923a)];
                    break;
                case 23:
                    jVar.f36885b = obtainStyledAttributes.getLayoutDimension(index, jVar.f36885b);
                    break;
                case 24:
                    jVar.f36863C = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36863C);
                    break;
                case 25:
                    jVar.f36895g = f(obtainStyledAttributes, index, jVar.f36895g);
                    break;
                case 26:
                    jVar.f36897h = f(obtainStyledAttributes, index, jVar.f36897h);
                    break;
                case 27:
                    jVar.f36862B = obtainStyledAttributes.getInt(index, jVar.f36862B);
                    break;
                case 28:
                    jVar.f36864D = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36864D);
                    break;
                case 29:
                    jVar.f36899i = f(obtainStyledAttributes, index, jVar.f36899i);
                    break;
                case 30:
                    jVar.f36901j = f(obtainStyledAttributes, index, jVar.f36901j);
                    break;
                case 31:
                    jVar.f36868H = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36868H);
                    break;
                case 32:
                    jVar.f36907p = f(obtainStyledAttributes, index, jVar.f36907p);
                    break;
                case 33:
                    jVar.f36908q = f(obtainStyledAttributes, index, jVar.f36908q);
                    break;
                case 34:
                    jVar.f36865E = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36865E);
                    break;
                case 35:
                    jVar.f36903l = f(obtainStyledAttributes, index, jVar.f36903l);
                    break;
                case 36:
                    jVar.f36902k = f(obtainStyledAttributes, index, jVar.f36902k);
                    break;
                case 37:
                    jVar.f36912u = obtainStyledAttributes.getFloat(index, jVar.f36912u);
                    break;
                case 38:
                    iVar.f36854a = obtainStyledAttributes.getResourceId(index, iVar.f36854a);
                    break;
                case 39:
                    jVar.P = obtainStyledAttributes.getFloat(index, jVar.P);
                    break;
                case 40:
                    jVar.f36875O = obtainStyledAttributes.getFloat(index, jVar.f36875O);
                    break;
                case 41:
                    jVar.Q = obtainStyledAttributes.getInt(index, jVar.Q);
                    break;
                case 42:
                    jVar.f36876R = obtainStyledAttributes.getInt(index, jVar.f36876R);
                    break;
                case 43:
                    lVar.f36925c = obtainStyledAttributes.getFloat(index, lVar.f36925c);
                    break;
                case 44:
                    mVar.f36938k = true;
                    mVar.f36939l = obtainStyledAttributes.getDimension(index, mVar.f36939l);
                    break;
                case 45:
                    mVar.f36929b = obtainStyledAttributes.getFloat(index, mVar.f36929b);
                    break;
                case 46:
                    mVar.f36930c = obtainStyledAttributes.getFloat(index, mVar.f36930c);
                    break;
                case 47:
                    mVar.f36931d = obtainStyledAttributes.getFloat(index, mVar.f36931d);
                    break;
                case y.f44626f /* 48 */:
                    mVar.f36932e = obtainStyledAttributes.getFloat(index, mVar.f36932e);
                    break;
                case 49:
                    mVar.f36933f = obtainStyledAttributes.getDimension(index, mVar.f36933f);
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    mVar.f36934g = obtainStyledAttributes.getDimension(index, mVar.f36934g);
                    break;
                case 51:
                    mVar.f36935h = obtainStyledAttributes.getDimension(index, mVar.f36935h);
                    break;
                case 52:
                    mVar.f36936i = obtainStyledAttributes.getDimension(index, mVar.f36936i);
                    break;
                case 53:
                    mVar.f36937j = obtainStyledAttributes.getDimension(index, mVar.f36937j);
                    break;
                case 54:
                    jVar.S = obtainStyledAttributes.getInt(index, jVar.S);
                    break;
                case 55:
                    jVar.T = obtainStyledAttributes.getInt(index, jVar.T);
                    break;
                case 56:
                    jVar.f36877U = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36877U);
                    break;
                case 57:
                    jVar.f36878V = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36878V);
                    break;
                case 58:
                    jVar.f36879W = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36879W);
                    break;
                case 59:
                    jVar.f36880X = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36880X);
                    break;
                case 60:
                    mVar.f36928a = obtainStyledAttributes.getFloat(index, mVar.f36928a);
                    break;
                case 61:
                    jVar.f36914w = f(obtainStyledAttributes, index, jVar.f36914w);
                    break;
                case 62:
                    jVar.f36915x = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36915x);
                    break;
                case 63:
                    jVar.f36916y = obtainStyledAttributes.getFloat(index, jVar.f36916y);
                    break;
                case 64:
                    kVar.f36919a = f(obtainStyledAttributes, index, kVar.f36919a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        kVar.getClass();
                        break;
                    } else {
                        String str = AbstractC2933a.f29522a[obtainStyledAttributes.getInteger(index, 0)];
                        kVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    kVar.getClass();
                    break;
                case 67:
                    kVar.f36922d = obtainStyledAttributes.getFloat(index, kVar.f36922d);
                    break;
                case 68:
                    lVar.f36926d = obtainStyledAttributes.getFloat(index, lVar.f36926d);
                    break;
                case 69:
                    jVar.f36881Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    jVar.f36882Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    AbstractC3612c.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    jVar.f36884a0 = obtainStyledAttributes.getInt(index, jVar.f36884a0);
                    break;
                case 73:
                    jVar.f36886b0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f36886b0);
                    break;
                case 74:
                    jVar.f36892e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    jVar.f36900i0 = obtainStyledAttributes.getBoolean(index, jVar.f36900i0);
                    break;
                case 76:
                    kVar.f36920b = obtainStyledAttributes.getInt(index, kVar.f36920b);
                    break;
                case 77:
                    jVar.f36894f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    lVar.f36924b = obtainStyledAttributes.getInt(index, lVar.f36924b);
                    break;
                case 79:
                    kVar.f36921c = obtainStyledAttributes.getFloat(index, kVar.f36921c);
                    break;
                case 80:
                    jVar.f36896g0 = obtainStyledAttributes.getBoolean(index, jVar.f36896g0);
                    break;
                case 81:
                    jVar.f36898h0 = obtainStyledAttributes.getBoolean(index, jVar.f36898h0);
                    break;
                case 82:
                    AbstractC3612c.r("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    AbstractC3612c.r("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [k1.a, android.view.View, k1.c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.ViewGroup] */
    public final void a(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        int i10;
        int i11;
        HashMap hashMap;
        NoSuchMethodException e10;
        IllegalAccessException e11;
        InvocationTargetException e12;
        String str;
        n nVar = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int i12 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f36944c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = constraintLayout3.getChildAt(i13);
            int id2 = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                AbstractC3612c.r("ConstraintSet", sb2.toString());
            } else if (nVar.f36943b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id2));
                        if (childAt instanceof C4153a) {
                            iVar.f36857d.f36888c0 = i12;
                        }
                        int i14 = iVar.f36857d.f36888c0;
                        if (i14 != -1 && i14 == i12) {
                            C4153a c4153a = (C4153a) childAt;
                            c4153a.setId(id2);
                            j jVar = iVar.f36857d;
                            c4153a.setType(jVar.f36884a0);
                            c4153a.setMargin(jVar.f36886b0);
                            c4153a.setAllowsGoneWidget(jVar.f36900i0);
                            int[] iArr = jVar.f36890d0;
                            if (iArr != null) {
                                c4153a.setReferencedIds(iArr);
                            } else {
                                String str2 = jVar.f36892e0;
                                if (str2 != null) {
                                    int[] c10 = c(c4153a, str2);
                                    jVar.f36890d0 = c10;
                                    c4153a.setReferencedIds(c10);
                                }
                            }
                        }
                        e eVar = (e) childAt.getLayoutParams();
                        eVar.a();
                        iVar.a(eVar);
                        HashMap hashMap3 = iVar.f36859f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : hashMap3.keySet()) {
                            C4154b c4154b = (C4154b) hashMap3.get(str3);
                            String r10 = R.a.r("set", str3);
                            int i15 = childCount;
                            try {
                                switch (AbstractC6708l.f(c4154b.f36768a)) {
                                    case 0:
                                        hashMap = hashMap3;
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(r10, clsArr).invoke(childAt, Integer.valueOf(c4154b.f36769b));
                                        } catch (IllegalAccessException e13) {
                                            e11 = e13;
                                            StringBuilder s10 = android.gov.nist.core.a.s(" Custom Attribute \"", str3, "\" not found on ");
                                            s10.append(cls.getName());
                                            AbstractC3612c.c("TransitionLayout", s10.toString());
                                            e11.printStackTrace();
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        } catch (NoSuchMethodException e14) {
                                            e10 = e14;
                                            AbstractC3612c.c("TransitionLayout", e10.getMessage());
                                            AbstractC3612c.c("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            AbstractC3612c.c("TransitionLayout", cls.getName() + " must have a method " + r10);
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        } catch (InvocationTargetException e15) {
                                            e12 = e15;
                                            StringBuilder s11 = android.gov.nist.core.a.s(" Custom Attribute \"", str3, "\" not found on ");
                                            s11.append(cls.getName());
                                            AbstractC3612c.c("TransitionLayout", s11.toString());
                                            e12.printStackTrace();
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        }
                                    case 1:
                                        hashMap = hashMap3;
                                        cls.getMethod(r10, Float.TYPE).invoke(childAt, Float.valueOf(c4154b.f36770c));
                                        break;
                                    case 2:
                                        hashMap = hashMap3;
                                        cls.getMethod(r10, Integer.TYPE).invoke(childAt, Integer.valueOf(c4154b.f36773f));
                                        break;
                                    case 3:
                                        hashMap = hashMap3;
                                        Method method = cls.getMethod(r10, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c4154b.f36773f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        hashMap = hashMap3;
                                        cls.getMethod(r10, CharSequence.class).invoke(childAt, c4154b.f36771d);
                                        break;
                                    case 5:
                                        hashMap = hashMap3;
                                        cls.getMethod(r10, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c4154b.f36772e));
                                        break;
                                    case 6:
                                        hashMap = hashMap3;
                                        try {
                                            cls.getMethod(r10, Float.TYPE).invoke(childAt, Float.valueOf(c4154b.f36770c));
                                        } catch (IllegalAccessException e16) {
                                            e11 = e16;
                                            StringBuilder s102 = android.gov.nist.core.a.s(" Custom Attribute \"", str3, "\" not found on ");
                                            s102.append(cls.getName());
                                            AbstractC3612c.c("TransitionLayout", s102.toString());
                                            e11.printStackTrace();
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        } catch (NoSuchMethodException e17) {
                                            e10 = e17;
                                            AbstractC3612c.c("TransitionLayout", e10.getMessage());
                                            AbstractC3612c.c("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            AbstractC3612c.c("TransitionLayout", cls.getName() + " must have a method " + r10);
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        } catch (InvocationTargetException e18) {
                                            e12 = e18;
                                            StringBuilder s112 = android.gov.nist.core.a.s(" Custom Attribute \"", str3, "\" not found on ");
                                            s112.append(cls.getName());
                                            AbstractC3612c.c("TransitionLayout", s112.toString());
                                            e12.printStackTrace();
                                            childCount = i15;
                                            hashMap3 = hashMap;
                                        }
                                    default:
                                        hashMap = hashMap3;
                                        break;
                                }
                            } catch (IllegalAccessException e19) {
                                e11 = e19;
                                hashMap = hashMap3;
                            } catch (NoSuchMethodException e20) {
                                e10 = e20;
                                hashMap = hashMap3;
                            } catch (InvocationTargetException e21) {
                                e12 = e21;
                                hashMap = hashMap3;
                            }
                            childCount = i15;
                            hashMap3 = hashMap;
                        }
                        i10 = childCount;
                        childAt.setLayoutParams(eVar);
                        l lVar = iVar.f36855b;
                        if (lVar.f36924b == 0) {
                            childAt.setVisibility(lVar.f36923a);
                        }
                        childAt.setAlpha(lVar.f36925c);
                        m mVar = iVar.f36858e;
                        childAt.setRotation(mVar.f36928a);
                        childAt.setRotationX(mVar.f36929b);
                        childAt.setRotationY(mVar.f36930c);
                        childAt.setScaleX(mVar.f36931d);
                        childAt.setScaleY(mVar.f36932e);
                        if (!Float.isNaN(mVar.f36933f)) {
                            childAt.setPivotX(mVar.f36933f);
                        }
                        if (!Float.isNaN(mVar.f36934g)) {
                            childAt.setPivotY(mVar.f36934g);
                        }
                        childAt.setTranslationX(mVar.f36935h);
                        childAt.setTranslationY(mVar.f36936i);
                        childAt.setTranslationZ(mVar.f36937j);
                        if (mVar.f36938k) {
                            childAt.setElevation(mVar.f36939l);
                        }
                    } else {
                        i10 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i11 = 1;
                    i13 += i11;
                    constraintLayout3 = constraintLayout;
                    i12 = i11;
                    childCount = i10;
                    nVar = this;
                }
            }
            i11 = i12;
            i10 = childCount;
            i13 += i11;
            constraintLayout3 = constraintLayout;
            i12 = i11;
            childCount = i10;
            nVar = this;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            j jVar2 = iVar2.f36857d;
            int i16 = jVar2.f36888c0;
            if (i16 != -1) {
                if (i16 != 1) {
                    constraintLayout2 = constraintLayout;
                } else {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f36774h0 = new int[32];
                    view.f36779m0 = new HashMap();
                    view.f36776j0 = context;
                    view.e(null);
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = jVar2.f36890d0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f36892e0;
                        if (str4 != null) {
                            int[] c11 = c(view, str4);
                            jVar2.f36890d0 = c11;
                            view.setReferencedIds(c11);
                        }
                    }
                    view.setType(jVar2.f36884a0);
                    view.setMargin(jVar2.f36886b0);
                    e a5 = ConstraintLayout.a();
                    view.g();
                    iVar2.a(a5);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView((View) view, a5);
                }
            } else {
                constraintLayout2 = constraintLayout;
            }
            if (jVar2.f36883a) {
                p pVar = new p(constraintLayout.getContext());
                pVar.setId(num.intValue());
                e a10 = ConstraintLayout.a();
                iVar2.a(a10);
                constraintLayout2.addView(pVar, a10);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        NoSuchMethodException e10;
        IllegalAccessException e11;
        InvocationTargetException e12;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f36944c;
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (nVar.f36943b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id2));
            HashMap hashMap2 = nVar.f36942a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C4154b c4154b = (C4154b) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new C4154b(c4154b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        i10 = childCount;
                    } else {
                        i10 = childCount;
                        try {
                            hashMap3.put(str, new C4154b(c4154b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e13) {
                            e11 = e13;
                            e11.printStackTrace();
                            childCount = i10;
                        } catch (NoSuchMethodException e14) {
                            e10 = e14;
                            e10.printStackTrace();
                            childCount = i10;
                        } catch (InvocationTargetException e15) {
                            e12 = e15;
                            e12.printStackTrace();
                            childCount = i10;
                        }
                    }
                } catch (IllegalAccessException e16) {
                    e11 = e16;
                    i10 = childCount;
                } catch (NoSuchMethodException e17) {
                    e10 = e17;
                    i10 = childCount;
                } catch (InvocationTargetException e18) {
                    e12 = e18;
                    i10 = childCount;
                }
                childCount = i10;
            }
            int i12 = childCount;
            iVar.f36859f = hashMap3;
            iVar.f36854a = id2;
            int i13 = eVar.f36809d;
            j jVar = iVar.f36857d;
            jVar.f36895g = i13;
            jVar.f36897h = eVar.f36811e;
            jVar.f36899i = eVar.f36813f;
            jVar.f36901j = eVar.f36815g;
            jVar.f36902k = eVar.f36817h;
            jVar.f36903l = eVar.f36819i;
            jVar.f36904m = eVar.f36821j;
            jVar.f36905n = eVar.f36823k;
            jVar.f36906o = eVar.f36825l;
            jVar.f36907p = eVar.f36829p;
            jVar.f36908q = eVar.f36830q;
            jVar.f36909r = eVar.f36831r;
            jVar.f36910s = eVar.f36832s;
            jVar.f36911t = eVar.f36839z;
            jVar.f36912u = eVar.f36781A;
            jVar.f36913v = eVar.f36782B;
            jVar.f36914w = eVar.f36826m;
            jVar.f36915x = eVar.f36827n;
            jVar.f36916y = eVar.f36828o;
            jVar.f36917z = eVar.P;
            jVar.f36861A = eVar.Q;
            jVar.f36862B = eVar.f36796R;
            jVar.f36893f = eVar.f36807c;
            jVar.f36889d = eVar.f36803a;
            jVar.f36891e = eVar.f36805b;
            jVar.f36885b = ((ViewGroup.MarginLayoutParams) eVar).width;
            jVar.f36887c = ((ViewGroup.MarginLayoutParams) eVar).height;
            jVar.f36863C = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            jVar.f36864D = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            jVar.f36865E = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            jVar.f36866F = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            jVar.f36875O = eVar.f36785E;
            jVar.P = eVar.f36784D;
            jVar.f36876R = eVar.f36787G;
            jVar.Q = eVar.f36786F;
            jVar.f36896g0 = eVar.S;
            jVar.f36898h0 = eVar.T;
            jVar.S = eVar.f36788H;
            jVar.T = eVar.f36789I;
            jVar.f36877U = eVar.f36792L;
            jVar.f36878V = eVar.f36793M;
            jVar.f36879W = eVar.f36790J;
            jVar.f36880X = eVar.f36791K;
            jVar.f36881Y = eVar.f36794N;
            jVar.f36882Z = eVar.f36795O;
            jVar.f36894f0 = eVar.f36797U;
            jVar.f36870J = eVar.f36834u;
            jVar.f36872L = eVar.f36836w;
            jVar.f36869I = eVar.f36833t;
            jVar.f36871K = eVar.f36835v;
            jVar.f36874N = eVar.f36837x;
            jVar.f36873M = eVar.f36838y;
            jVar.f36867G = eVar.getMarginEnd();
            jVar.f36868H = eVar.getMarginStart();
            int visibility = childAt.getVisibility();
            l lVar = iVar.f36855b;
            lVar.f36923a = visibility;
            lVar.f36925c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            m mVar = iVar.f36858e;
            mVar.f36928a = rotation;
            mVar.f36929b = childAt.getRotationX();
            mVar.f36930c = childAt.getRotationY();
            mVar.f36931d = childAt.getScaleX();
            mVar.f36932e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                mVar.f36933f = pivotX;
                mVar.f36934g = pivotY;
            }
            mVar.f36935h = childAt.getTranslationX();
            mVar.f36936i = childAt.getTranslationY();
            mVar.f36937j = childAt.getTranslationZ();
            if (mVar.f36938k) {
                mVar.f36939l = childAt.getElevation();
            }
            if (childAt instanceof C4153a) {
                C4153a c4153a = (C4153a) childAt;
                jVar.f36900i0 = c4153a.f36767p0.f32438g0;
                jVar.f36890d0 = c4153a.getReferencedIds();
                jVar.f36884a0 = c4153a.getType();
                jVar.f36886b0 = c4153a.getMargin();
            }
            i11++;
            nVar = this;
            childCount = i12;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        i d10 = d(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            d10.f36857d.f36883a = true;
                        }
                        this.f36944c.put(Integer.valueOf(d10.f36854a), d10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
