package J0;

import D1.x0;
import D1.y0;
import D1.z0;
import E2.Z;
import L2.r;
import V1.D;
import V1.DialogInterface$OnCancelListenerC1475p;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.AbstractC2011b;
import androidx.datastore.preferences.protobuf.AbstractC2022g0;
import androidx.datastore.preferences.protobuf.AbstractC2025j;
import androidx.datastore.preferences.protobuf.AbstractC2031p;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.F;
import androidx.profileinstaller.ProfileInstallReceiver;
import c3.C2283c;
import c3.C2284d;
import c3.C2285e;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.android.core.AbstractC3612c;
import j$.util.concurrent.ConcurrentHashMap;
import j.AbstractC3873c;
import j.C3872b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C4528h;
import p.B;
import p.C5032h;
import p.I;
import p.RunnableC5031g;
import p.View$OnKeyListenerC5033i;
import p.m;
import p.o;
import p.q;
import p2.C5059l;
import p2.O;
import q.AbstractC5210g0;
import q.C5222m;
import q.O0;
import r9.y;
import s1.AbstractC5528j;
import s1.p;
import s2.u;
import t7.C5680b;
import u3.AbstractC5830c;
import u8.AbstractC5856f;
import v7.AbstractC5991i;
import w7.AbstractC6130b;
import w7.AbstractC6134f;
import y2.C6513P;
import z1.C6749h;

/* loaded from: classes.dex */
public class a implements O0, B, AbstractC5210g0, m, p, F, Z, G2.e, AbstractC5830c, AbstractC3873c, AbstractC5856f, AbstractC6130b {

    /* renamed from: Y  reason: collision with root package name */
    public Object f8729Y;

    public a(int i10) {
        if (i10 != 12) {
            if (i10 != 21) {
                this.f8729Y = new ConcurrentHashMap();
                return;
            } else {
                this.f8729Y = new Object();
                return;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f8729Y = new z0();
        } else if (i11 >= 29) {
            this.f8729Y = new y0();
        } else {
            this.f8729Y = new x0();
        }
    }

    public static Object J(Object[] objArr, int i10, p pVar) {
        int i11;
        boolean z10;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = RCHTTPStatusCodes.BAD_REQUEST;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = null;
        int i13 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(pVar.s(obj2) - i11) * 2;
            if (pVar.t(obj2) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (obj == null || i13 > i14) {
                obj = obj2;
                i13 = i14;
            }
        }
        return obj;
    }

    @Override // p.B
    public boolean A(o oVar) {
        Object obj = this.f8729Y;
        if (oVar == ((C5222m) obj).f43455h0) {
            return false;
        }
        ((I) oVar).f41530A.getClass();
        ((C5222m) obj).getClass();
        B b10 = ((C5222m) this.f8729Y).f43457j0;
        if (b10 == null) {
            return false;
        }
        return b10.A(oVar);
    }

    @Override // androidx.lifecycle.F
    public void B(Object obj) {
        if (((AbstractC2086v) obj) != null) {
            DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p = (DialogInterface$OnCancelListenerC1475p) this.f8729Y;
            if (dialogInterface$OnCancelListenerC1475p.f18231h1) {
                View L10 = dialogInterface$OnCancelListenerC1475p.L();
                if (L10.getParent() == null) {
                    if (((DialogInterface$OnCancelListenerC1475p) this.f8729Y).f18235l1 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + ((DialogInterface$OnCancelListenerC1475p) this.f8729Y).f18235l1);
                        }
                        ((DialogInterface$OnCancelListenerC1475p) this.f8729Y).f18235l1.setContentView(L10);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    @Override // E2.Z
    public void C(long j6) {
        for (Z z10 : (Z[]) this.f8729Y) {
            z10.C(j6);
        }
    }

    public void D(int i10, int i11, r rVar) {
        C2283c c2283c;
        C2283c c2283c2;
        int i12;
        C2283c c2283c3;
        long j6;
        int i13;
        int i14;
        int i15;
        C2284d c2284d = (C2284d) this.f8729Y;
        SparseArray sparseArray = c2284d.f26208c;
        int i16 = 4;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        c2284d.e(i10);
                                        C2283c c2283c4 = c2284d.f26226u;
                                        byte[] bArr = new byte[i11];
                                        c2283c4.f26172w = bArr;
                                        rVar.readFully(bArr, 0, i11);
                                        return;
                                    }
                                    throw O.a("Unexpected id: " + i10, null);
                                }
                                c2284d.e(i10);
                                C2283c c2283c5 = c2284d.f26226u;
                                byte[] bArr2 = new byte[i11];
                                c2283c5.f26160k = bArr2;
                                rVar.readFully(bArr2, 0, i11);
                                return;
                            }
                            u uVar = c2284d.f26214i;
                            Arrays.fill(uVar.f45193a, (byte) 0);
                            rVar.readFully(uVar.f45193a, 4 - i11, i11);
                            uVar.F(0);
                            c2284d.f26228w = (int) uVar.v();
                            return;
                        }
                        byte[] bArr3 = new byte[i11];
                        rVar.readFully(bArr3, 0, i11);
                        c2284d.e(i10);
                        c2284d.f26226u.f26159j = new L2.F(1, 0, 0, bArr3);
                        return;
                    }
                    c2284d.e(i10);
                    C2283c c2283c6 = c2284d.f26226u;
                    byte[] bArr4 = new byte[i11];
                    c2283c6.f26158i = bArr4;
                    rVar.readFully(bArr4, 0, i11);
                    return;
                }
                c2284d.e(i10);
                C2283c c2283c7 = c2284d.f26226u;
                int i19 = c2283c7.f26156g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    rVar.l(i11);
                    return;
                }
                byte[] bArr5 = new byte[i11];
                c2283c7.f26142O = bArr5;
                rVar.readFully(bArr5, 0, i11);
                return;
            } else if (c2284d.f26188G == 2) {
                C2283c c2283c8 = (C2283c) sparseArray.get(c2284d.f26194M);
                if (c2284d.P == 4 && "V_VP9".equals(c2283c8.f26151b)) {
                    u uVar2 = c2284d.f26219n;
                    uVar2.C(i11);
                    rVar.readFully(uVar2.f45193a, 0, i11);
                    return;
                }
                rVar.l(i11);
                return;
            } else {
                return;
            }
        }
        int i20 = c2284d.f26188G;
        u uVar3 = c2284d.f26212g;
        if (i20 == 0) {
            C2285e c2285e = c2284d.f26206b;
            c2284d.f26194M = (int) c2285e.c(rVar, false, true, 8);
            c2284d.f26195N = c2285e.f26235c;
            c2284d.f26190I = -9223372036854775807L;
            c2284d.f26188G = 1;
            uVar3.C(0);
        }
        C2283c c2283c9 = (C2283c) sparseArray.get(c2284d.f26194M);
        if (c2283c9 == null) {
            rVar.l(i11 - c2284d.f26195N);
            c2284d.f26188G = 0;
            return;
        }
        c2283c9.f26148Y.getClass();
        if (c2284d.f26188G == 1) {
            c2284d.j(rVar, 3);
            int i21 = (uVar3.f45193a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                c2284d.f26192K = 1;
                int[] iArr = c2284d.f26193L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c2284d.f26193L = iArr;
                iArr[0] = (i11 - c2284d.f26195N) - 3;
            } else {
                c2284d.j(rVar, 4);
                int i22 = (uVar3.f45193a[3] & 255) + 1;
                c2284d.f26192K = i22;
                int[] iArr2 = c2284d.f26193L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                c2284d.f26193L = iArr2;
                if (i21 == 2) {
                    int i23 = c2284d.f26192K;
                    Arrays.fill(iArr2, 0, i23, ((i11 - c2284d.f26195N) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        i13 = c2284d.f26192K - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        c2284d.f26193L[i24] = 0;
                        while (true) {
                            i14 = i16 + 1;
                            c2284d.j(rVar, i14);
                            int i26 = uVar3.f45193a[i16] & 255;
                            int[] iArr3 = c2284d.f26193L;
                            i15 = iArr3[i24] + i26;
                            iArr3[i24] = i15;
                            if (i26 != 255) {
                                break;
                            }
                            i16 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i16 = i14;
                    }
                    c2284d.f26193L[i13] = ((i11 - c2284d.f26195N) - i16) - i25;
                } else if (i21 == 3) {
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = c2284d.f26192K - i17;
                        if (i27 < i29) {
                            c2284d.f26193L[i27] = i18;
                            int i30 = i16 + 1;
                            c2284d.j(rVar, i30);
                            if (uVar3.f45193a[i16] != 0) {
                                int i31 = i18;
                                while (true) {
                                    if (i31 < 8) {
                                        int i32 = i17 << (7 - i31);
                                        if ((uVar3.f45193a[i16] & i32) != 0) {
                                            int i33 = i30 + i31;
                                            c2284d.j(rVar, i33);
                                            c2283c3 = c2283c9;
                                            j6 = uVar3.f45193a[i16] & b10 & (~i32);
                                            while (i30 < i33) {
                                                j6 = (j6 << 8) | (uVar3.f45193a[i30] & 255);
                                                i30++;
                                                i33 = i33;
                                            }
                                            int i34 = i33;
                                            if (i27 > 0) {
                                                j6 -= (1 << ((i31 * 7) + 6)) - 1;
                                            }
                                            i16 = i34;
                                        } else {
                                            i31++;
                                            b10 = 255;
                                            i17 = 1;
                                        }
                                    } else {
                                        c2283c3 = c2283c9;
                                        j6 = 0;
                                        i16 = i30;
                                        break;
                                    }
                                }
                                if (j6 < -2147483648L || j6 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j6;
                                int[] iArr4 = c2284d.f26193L;
                                if (i27 != 0) {
                                    i35 += iArr4[i27 - 1];
                                }
                                iArr4[i27] = i35;
                                i28 += i35;
                                i27++;
                                c2283c9 = c2283c3;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw O.a("No valid varint length mask found", null);
                            }
                        } else {
                            c2283c2 = c2283c9;
                            c2284d.f26193L[i29] = ((i11 - c2284d.f26195N) - i16) - i28;
                            break;
                        }
                    }
                    throw O.a("EBML lacing sample size out of range.", null);
                } else {
                    throw O.a("Unexpected lacing value: " + i21, null);
                }
            }
            c2283c2 = c2283c9;
            byte[] bArr6 = uVar3.f45193a;
            c2284d.f26189H = c2284d.l((bArr6[1] & 255) | (bArr6[0] << 8)) + c2284d.f26183B;
            c2283c = c2283c2;
            if (c2283c.f26153d != 2 && (i10 != 163 || (uVar3.f45193a[2] & 128) != 128)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            c2284d.f26196O = i12;
            c2284d.f26188G = 2;
            c2284d.f26191J = 0;
        } else {
            c2283c = c2283c9;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = c2284d.f26191J;
                if (i36 < c2284d.f26192K) {
                    c2284d.f(c2283c, ((c2284d.f26191J * c2283c.f26154e) / 1000) + c2284d.f26189H, c2284d.f26196O, c2284d.m(rVar, c2283c, c2284d.f26193L[i36], false), 0);
                    c2284d.f26191J++;
                    c2283c = c2283c;
                } else {
                    c2284d.f26188G = 0;
                    return;
                }
            }
        } else {
            C2283c c2283c10 = c2283c;
            while (true) {
                int i37 = c2284d.f26191J;
                if (i37 < c2284d.f26192K) {
                    int[] iArr5 = c2284d.f26193L;
                    iArr5[i37] = c2284d.m(rVar, c2283c10, iArr5[i37], true);
                    c2284d.f26191J++;
                } else {
                    return;
                }
            }
        }
    }

    public E1.p E(int i10) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface F(Context context, r1.f fVar, Resources resources, int i10) {
        long longValue;
        r1.g gVar = (r1.g) J(fVar.f44284a, i10, new F4.a(10, this));
        if (gVar == null) {
            return null;
        }
        a aVar = AbstractC5528j.f45113a;
        int i11 = gVar.f44290f;
        String str = gVar.f44285a;
        Typeface I10 = aVar.I(context, resources, i11, str, i10);
        if (I10 != null) {
            AbstractC5528j.f45114b.c(AbstractC5528j.b(resources, i11, str, 0, i10), I10);
        }
        if (I10 != null) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                longValue = ((Number) declaredField.get(I10)).longValue();
            } catch (IllegalAccessException e10) {
                AbstractC3612c.d("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            } catch (NoSuchFieldException e11) {
                AbstractC3612c.d("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            }
            if (longValue != 0) {
                ((ConcurrentHashMap) this.f8729Y).put(Long.valueOf(longValue), fVar);
            }
            return I10;
        }
        longValue = 0;
        if (longValue != 0) {
        }
        return I10;
    }

    public Typeface G(Context context, C6749h[] c6749hArr, int i10) {
        InputStream inputStream;
        Throwable th2;
        InputStream inputStream2 = null;
        if (c6749hArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(K(i10, c6749hArr).f51453a);
            try {
                Typeface H6 = H(context, inputStream);
                y.Z(inputStream);
                return H6;
            } catch (IOException unused) {
                y.Z(inputStream);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                inputStream2 = inputStream;
                y.Z(inputStream2);
                throw th2;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public Typeface H(Context context, InputStream inputStream) {
        File x02 = y.x0(context);
        if (x02 == null) {
            return null;
        }
        try {
            if (!y.e0(x02, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(x02.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x02.delete();
        }
    }

    public Typeface I(Context context, Resources resources, int i10, String str, int i11) {
        File x02 = y.x0(context);
        if (x02 == null) {
            return null;
        }
        try {
            if (!y.d0(x02, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(x02.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x02.delete();
        }
    }

    public C6749h K(int i10, C6749h[] c6749hArr) {
        return (C6749h) J(c6749hArr, i10, new a(this));
    }

    public E1.p L(int i10) {
        return null;
    }

    public void M(int i10, double d10) {
        C2284d c2284d = (C2284d) this.f8729Y;
        if (i10 != 181) {
            if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        c2284d.e(i10);
                        c2284d.f26226u.f26132E = (float) d10;
                        return;
                    case 21970:
                        c2284d.e(i10);
                        c2284d.f26226u.f26133F = (float) d10;
                        return;
                    case 21971:
                        c2284d.e(i10);
                        c2284d.f26226u.f26134G = (float) d10;
                        return;
                    case 21972:
                        c2284d.e(i10);
                        c2284d.f26226u.f26135H = (float) d10;
                        return;
                    case 21973:
                        c2284d.e(i10);
                        c2284d.f26226u.f26136I = (float) d10;
                        return;
                    case 21974:
                        c2284d.e(i10);
                        c2284d.f26226u.f26137J = (float) d10;
                        return;
                    case 21975:
                        c2284d.e(i10);
                        c2284d.f26226u.f26138K = (float) d10;
                        return;
                    case 21976:
                        c2284d.e(i10);
                        c2284d.f26226u.f26139L = (float) d10;
                        return;
                    case 21977:
                        c2284d.e(i10);
                        c2284d.f26226u.f26140M = (float) d10;
                        return;
                    case 21978:
                        c2284d.e(i10);
                        c2284d.f26226u.f26141N = (float) d10;
                        return;
                    default:
                        switch (i10) {
                            case 30323:
                                c2284d.e(i10);
                                c2284d.f26226u.f26169t = (float) d10;
                                return;
                            case 30324:
                                c2284d.e(i10);
                                c2284d.f26226u.f26170u = (float) d10;
                                return;
                            case 30325:
                                c2284d.e(i10);
                                c2284d.f26226u.f26171v = (float) d10;
                                return;
                            default:
                                c2284d.getClass();
                                return;
                        }
                }
            }
            c2284d.f26224s = (long) d10;
            return;
        }
        c2284d.e(i10);
        c2284d.f26226u.f26143R = (int) d10;
    }

    public void N(int i10, long j6) {
        C2284d c2284d = (C2284d) this.f8729Y;
        c2284d.getClass();
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        c2284d.e(i10);
                        c2284d.f26226u.f26153d = (int) j6;
                        return;
                    case 136:
                        c2284d.e(i10);
                        C2283c c2283c = c2284d.f26226u;
                        if (j6 == 1) {
                            z10 = true;
                        }
                        c2283c.f26146W = z10;
                        return;
                    case 155:
                        c2284d.f26190I = c2284d.l(j6);
                        return;
                    case 159:
                        c2284d.e(i10);
                        c2284d.f26226u.P = (int) j6;
                        return;
                    case 176:
                        c2284d.e(i10);
                        c2284d.f26226u.f26162m = (int) j6;
                        return;
                    case 179:
                        c2284d.c(i10);
                        c2284d.f26184C.g(c2284d.l(j6));
                        return;
                    case 186:
                        c2284d.e(i10);
                        c2284d.f26226u.f26163n = (int) j6;
                        return;
                    case 215:
                        c2284d.e(i10);
                        c2284d.f26226u.f26152c = (int) j6;
                        return;
                    case 231:
                        c2284d.f26183B = c2284d.l(j6);
                        return;
                    case 238:
                        c2284d.P = (int) j6;
                        return;
                    case 241:
                        if (!c2284d.f26186E) {
                            c2284d.c(i10);
                            c2284d.f26185D.g(j6);
                            c2284d.f26186E = true;
                            return;
                        }
                        return;
                    case 251:
                        c2284d.Q = true;
                        return;
                    case 16871:
                        c2284d.e(i10);
                        c2284d.f26226u.f26156g = (int) j6;
                        return;
                    case 16980:
                        if (j6 != 3) {
                            throw O.a("ContentCompAlgo " + j6 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j6 < 1 || j6 > 2) {
                            throw O.a("DocTypeReadVersion " + j6 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j6 != 1) {
                            throw O.a("EBMLReadVersion " + j6 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j6 != 5) {
                            throw O.a("ContentEncAlgo " + j6 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j6 != 1) {
                            throw O.a("AESSettingsCipherMode " + j6 + " not supported", null);
                        }
                        return;
                    case 21420:
                        c2284d.f26229x = j6 + c2284d.f26222q;
                        return;
                    case 21432:
                        int i11 = (int) j6;
                        c2284d.e(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        c2284d.f26226u.f26173x = 3;
                                        return;
                                    }
                                    return;
                                }
                                c2284d.f26226u.f26173x = 1;
                                return;
                            }
                            c2284d.f26226u.f26173x = 2;
                            return;
                        }
                        c2284d.f26226u.f26173x = 0;
                        return;
                    case 21680:
                        c2284d.e(i10);
                        c2284d.f26226u.f26165p = (int) j6;
                        return;
                    case 21682:
                        c2284d.e(i10);
                        c2284d.f26226u.f26167r = (int) j6;
                        return;
                    case 21690:
                        c2284d.e(i10);
                        c2284d.f26226u.f26166q = (int) j6;
                        return;
                    case 21930:
                        c2284d.e(i10);
                        C2283c c2283c2 = c2284d.f26226u;
                        if (j6 == 1) {
                            z10 = true;
                        }
                        c2283c2.f26145V = z10;
                        return;
                    case 21938:
                        c2284d.e(i10);
                        C2283c c2283c3 = c2284d.f26226u;
                        c2283c3.f26174y = true;
                        c2283c3.f26164o = (int) j6;
                        return;
                    case 21998:
                        c2284d.e(i10);
                        c2284d.f26226u.f26155f = (int) j6;
                        return;
                    case 22186:
                        c2284d.e(i10);
                        c2284d.f26226u.S = j6;
                        return;
                    case 22203:
                        c2284d.e(i10);
                        c2284d.f26226u.T = j6;
                        return;
                    case 25188:
                        c2284d.e(i10);
                        c2284d.f26226u.Q = (int) j6;
                        return;
                    case 30114:
                        c2284d.f26197R = j6;
                        return;
                    case 30321:
                        c2284d.e(i10);
                        int i12 = (int) j6;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        c2284d.f26226u.f26168s = 3;
                                        return;
                                    }
                                    return;
                                }
                                c2284d.f26226u.f26168s = 2;
                                return;
                            }
                            c2284d.f26226u.f26168s = 1;
                            return;
                        }
                        c2284d.f26226u.f26168s = 0;
                        return;
                    case 2352003:
                        c2284d.e(i10);
                        c2284d.f26226u.f26154e = (int) j6;
                        return;
                    case 2807729:
                        c2284d.f26223r = j6;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                c2284d.e(i10);
                                int i13 = (int) j6;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        c2284d.f26226u.f26129B = 1;
                                        return;
                                    }
                                    return;
                                }
                                c2284d.f26226u.f26129B = 2;
                                return;
                            case 21946:
                                c2284d.e(i10);
                                int d10 = C5059l.d((int) j6);
                                if (d10 != -1) {
                                    c2284d.f26226u.f26128A = d10;
                                    return;
                                }
                                return;
                            case 21947:
                                c2284d.e(i10);
                                c2284d.f26226u.f26174y = true;
                                int c10 = C5059l.c((int) j6);
                                if (c10 != -1) {
                                    c2284d.f26226u.f26175z = c10;
                                    return;
                                }
                                return;
                            case 21948:
                                c2284d.e(i10);
                                c2284d.f26226u.f26130C = (int) j6;
                                return;
                            case 21949:
                                c2284d.e(i10);
                                c2284d.f26226u.f26131D = (int) j6;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j6 != 1) {
                throw O.a("ContentEncodingScope " + j6 + " not supported", null);
            }
        } else if (j6 == 0) {
        } else {
            throw O.a("ContentEncodingOrder " + j6 + " not supported", null);
        }
    }

    public boolean O(int i10, int i11, Bundle bundle) {
        return false;
    }

    public long P() {
        return ((ByteBuffer) this.f8729Y).getInt() & 4294967295L;
    }

    public void Q(int i10) {
        Object obj = this.f8729Y;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i10);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [c3.c, java.lang.Object] */
    public void R(long j6, int i10, long j10) {
        C2284d c2284d = (C2284d) this.f8729Y;
        Gi.e.o(c2284d.f26207b0);
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !c2284d.f26227v) {
                                            if (c2284d.f26209d && c2284d.f26231z != -1) {
                                                c2284d.f26230y = true;
                                                return;
                                            }
                                            c2284d.f26207b0.b(new L2.u(c2284d.f26225t));
                                            c2284d.f26227v = true;
                                            return;
                                        }
                                        return;
                                    }
                                    c2284d.f26184C = new C4528h(3);
                                    c2284d.f26185D = new C4528h(3);
                                    return;
                                }
                                long j11 = c2284d.f26222q;
                                if (j11 != -1 && j11 != j6) {
                                    throw O.a("Multiple Segment elements not supported", null);
                                }
                                c2284d.f26222q = j6;
                                c2284d.f26221p = j10;
                                return;
                            }
                            c2284d.e(i10);
                            c2284d.f26226u.f26174y = true;
                            return;
                        }
                        c2284d.e(i10);
                        c2284d.f26226u.f26157h = true;
                        return;
                    }
                    c2284d.f26228w = -1;
                    c2284d.f26229x = -1L;
                    return;
                }
                c2284d.f26186E = false;
                return;
            }
            ?? obj = new Object();
            obj.f26162m = -1;
            obj.f26163n = -1;
            obj.f26164o = -1;
            obj.f26165p = -1;
            obj.f26166q = -1;
            obj.f26167r = 0;
            obj.f26168s = -1;
            obj.f26169t = 0.0f;
            obj.f26170u = 0.0f;
            obj.f26171v = 0.0f;
            obj.f26172w = null;
            obj.f26173x = -1;
            obj.f26174y = false;
            obj.f26175z = -1;
            obj.f26128A = -1;
            obj.f26129B = -1;
            obj.f26130C = 1000;
            obj.f26131D = RCHTTPStatusCodes.SUCCESS;
            obj.f26132E = -1.0f;
            obj.f26133F = -1.0f;
            obj.f26134G = -1.0f;
            obj.f26135H = -1.0f;
            obj.f26136I = -1.0f;
            obj.f26137J = -1.0f;
            obj.f26138K = -1.0f;
            obj.f26139L = -1.0f;
            obj.f26140M = -1.0f;
            obj.f26141N = -1.0f;
            obj.P = 1;
            obj.Q = -1;
            obj.f26143R = 8000;
            obj.S = 0L;
            obj.T = 0L;
            obj.f26146W = true;
            obj.f26147X = "eng";
            c2284d.f26226u = obj;
            return;
        }
        c2284d.Q = false;
        c2284d.f26197R = 0L;
    }

    public void S(int i10, String str) {
        C2284d c2284d = (C2284d) this.f8729Y;
        c2284d.getClass();
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 == 2274716) {
                        c2284d.e(i10);
                        c2284d.f26226u.f26147X = str;
                        return;
                    }
                    return;
                }
                c2284d.e(i10);
                c2284d.f26226u.f26150a = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw O.a("DocType " + str + " not supported", null);
            } else {
                return;
            }
        }
        c2284d.e(i10);
        c2284d.f26226u.f26151b = str;
    }

    public void T(int i10, boolean z10) {
        ((AbstractC2031p) this.f8729Y).J(i10, z10);
    }

    public void U(int i10, AbstractC2025j abstractC2025j) {
        ((AbstractC2031p) this.f8729Y).L(i10, abstractC2025j);
    }

    public void V(int i10, double d10) {
        AbstractC2031p abstractC2031p = (AbstractC2031p) this.f8729Y;
        abstractC2031p.getClass();
        abstractC2031p.P(i10, Double.doubleToRawLongBits(d10));
    }

    public void W(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).R(i10, i11);
    }

    public void X(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).N(i10, i11);
    }

    public void Y(int i10, long j6) {
        ((AbstractC2031p) this.f8729Y).P(i10, j6);
    }

    public void Z(int i10, float f6) {
        AbstractC2031p abstractC2031p = (AbstractC2031p) this.f8729Y;
        abstractC2031p.getClass();
        abstractC2031p.N(i10, Float.floatToRawIntBits(f6));
    }

    @Override // u8.AbstractC5857g
    public Object a() {
        return this.f8729Y;
    }

    public void a0(int i10, AbstractC2022g0 abstractC2022g0, Object obj) {
        AbstractC2031p abstractC2031p = (AbstractC2031p) this.f8729Y;
        abstractC2031p.X(i10, 3);
        abstractC2022g0.i((AbstractC2011b) obj, abstractC2031p.f25102c);
        abstractC2031p.X(i10, 4);
    }

    @Override // p.B
    public void b(o oVar, boolean z10) {
        if (oVar instanceof I) {
            oVar.k().c(false);
        }
        B b10 = ((C5222m) this.f8729Y).f43457j0;
        if (b10 != null) {
            b10.b(oVar, z10);
        }
    }

    public void b0(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).R(i10, i11);
    }

    @Override // E2.Z
    public long c() {
        long j6 = Long.MAX_VALUE;
        for (Z z10 : (Z[]) this.f8729Y) {
            long c10 = z10.c();
            if (c10 != Long.MIN_VALUE) {
                j6 = Math.min(j6, c10);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    public void c0(int i10, long j6) {
        ((AbstractC2031p) this.f8729Y).a0(i10, j6);
    }

    @Override // j.AbstractC3873c
    public void d(Object obj) {
        Bundle bundle;
        ProxyBillingActivity proxyBillingActivity = (ProxyBillingActivity) this.f8729Y;
        C3872b c3872b = (C3872b) obj;
        proxyBillingActivity.getClass();
        Intent intent = c3872b.f35797Z;
        int i10 = AbstractC2468q.b(intent, "ProxyBillingActivity").f9439a;
        ResultReceiver resultReceiver = proxyBillingActivity.f26697C0;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = null;
            } else {
                bundle = intent.getExtras();
            }
            resultReceiver.send(i10, bundle);
        }
        int i11 = c3872b.f35796Y;
        if (i11 != -1 || i10 != 0) {
            AbstractC2468q.e("ProxyBillingActivity", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivity.finish();
    }

    public void d0(int i10, AbstractC2022g0 abstractC2022g0, Object obj) {
        ((AbstractC2031p) this.f8729Y).T(i10, (AbstractC2011b) obj, abstractC2022g0);
    }

    public void e0(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).N(i10, i11);
    }

    @Override // u3.AbstractC5830c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void f0(int i10, long j6) {
        ((AbstractC2031p) this.f8729Y).P(i10, j6);
    }

    @Override // q.O0
    public void g(o oVar, MenuItem menuItem) {
        ((View$OnKeyListenerC5033i) this.f8729Y).f41575l0.removeCallbacksAndMessages(oVar);
    }

    public void g0(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).Y(i10, (i11 >> 31) ^ (i11 << 1));
    }

    @Override // u3.AbstractC5830c
    public void h(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            AbstractC3612c.d("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f8729Y).setResultCode(i10);
    }

    public void h0(int i10, long j6) {
        ((AbstractC2031p) this.f8729Y).a0(i10, (j6 >> 63) ^ (j6 << 1));
    }

    @Override // p.m
    public boolean i(o oVar, MenuItem menuItem) {
        ((Toolbar) this.f8729Y).getClass();
        return false;
    }

    public void i0(int i10, int i11) {
        ((AbstractC2031p) this.f8729Y).Y(i10, i11);
    }

    public void j0(int i10, long j6) {
        ((AbstractC2031p) this.f8729Y).a0(i10, j6);
    }

    @Override // E2.Z
    public boolean l() {
        for (Z z10 : (Z[]) this.f8729Y) {
            if (z10.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // E2.Z
    public boolean m(C6513P c6513p) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long c10 = c();
            long j6 = Long.MIN_VALUE;
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            Z[] zArr = (Z[]) this.f8729Y;
            int length = zArr.length;
            int i10 = 0;
            z10 = false;
            while (i10 < length) {
                Z z13 = zArr[i10];
                long c11 = z13.c();
                if (c11 != j6 && c11 <= c6513p.f50454a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c11 == c10 || z11) {
                    z10 |= z13.m(c6513p);
                }
                i10++;
                j6 = Long.MIN_VALUE;
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // w7.AbstractC6130b
    public void n(C5680b c5680b) {
        boolean z10;
        if (c5680b.f45761Z == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = this.f8729Y;
        if (z10) {
            AbstractC6134f abstractC6134f = (AbstractC6134f) obj;
            abstractC6134f.d(null, abstractC6134f.f48162x);
            return;
        }
        a aVar = ((AbstractC6134f) obj).f48153o;
        if (aVar != null) {
            ((AbstractC5991i) aVar.f8729Y).h(c5680b);
        }
    }

    @Override // s1.p
    public int s(Object obj) {
        return ((C6749h) obj).f51455c;
    }

    @Override // s1.p
    public boolean t(Object obj) {
        return ((C6749h) obj).f51456d;
    }

    @Override // p.m
    public void w(o oVar) {
        C5222m c5222m = ((Toolbar) this.f8729Y).f24598h0.f24505A0;
        if (c5222m == null || !c5222m.h()) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) this.f8729Y).f24587N0.f17493h0).iterator();
            while (it.hasNext()) {
                ((D) it.next()).f18020a.s();
            }
        }
        ((Toolbar) this.f8729Y).getClass();
    }

    @Override // E2.Z
    public long x() {
        long j6 = Long.MAX_VALUE;
        for (Z z10 : (Z[]) this.f8729Y) {
            long x10 = z10.x();
            if (x10 != Long.MIN_VALUE) {
                j6 = Math.min(j6, x10);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // q.O0
    public void z(o oVar, q qVar) {
        C5032h c5032h = null;
        ((View$OnKeyListenerC5033i) this.f8729Y).f41575l0.removeCallbacksAndMessages(null);
        int size = ((View$OnKeyListenerC5033i) this.f8729Y).f41577n0.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (oVar == ((C5032h) ((View$OnKeyListenerC5033i) this.f8729Y).f41577n0.get(i10)).f41562b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < ((View$OnKeyListenerC5033i) this.f8729Y).f41577n0.size()) {
            c5032h = (C5032h) ((View$OnKeyListenerC5033i) this.f8729Y).f41577n0.get(i11);
        }
        ((View$OnKeyListenerC5033i) this.f8729Y).f41575l0.postAtTime(new RunnableC5031g(this, c5032h, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    public /* synthetic */ a(Object obj) {
        this.f8729Y = obj;
    }

    public a() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8729Y = new H0.D(this);
        } else {
            this.f8729Y = new H0.D(this);
        }
    }

    @Override // q.AbstractC5210g0
    public void o(int i10) {
    }

    @Override // q.AbstractC5210g0
    public void y(int i10) {
    }
}
