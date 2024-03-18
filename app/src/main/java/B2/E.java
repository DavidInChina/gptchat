package B2;

import A2.O;
import N.b0;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import i4.C3472e;
import i4.C3474g;
import id.AbstractC3557B;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ji.C4113B;
import lg.AbstractC4456a;
import lg.AbstractC4468m;
import lg.C4444B;
import lg.C4462g;
import lg.C4465j;
import lg.C4469n;
import lg.EnumC4454L;
import lg.EnumC4455M;
import p2.AbstractC5058k;
import p2.C5052e;
import p2.C5065s;
import s2.AbstractC5530A;
import v2.AbstractC5968g;
import w.C6054a;
import w.C6060g;
import x8.p0;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1738a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1739b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1740c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1741d;

    public E() {
        this.f1738a = false;
        this.f1739b = new C6060g();
        this.f1741d = new HashMap();
        this.f1740c = new b0(3, this);
    }

    public static byte[] e(AbstractC5968g abstractC5968g, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        v2.D d10 = new v2.D(abstractC5968g.a());
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        Gi.e.p(parse, "The uri must be set.");
        v2.l lVar = new v2.l(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        v2.l lVar2 = lVar;
        while (true) {
            try {
                v2.j jVar = new v2.j(d10, lVar2);
                try {
                    int i11 = AbstractC5530A.f45131a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = jVar.read(bArr2);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            AbstractC5530A.g(jVar);
                            return byteArray;
                        }
                    }
                } catch (v2.y e10) {
                    int i12 = e10.f47143i0;
                    String str2 = null;
                    if ((i12 == 307 || i12 == 308) && i10 < 5 && (map2 = e10.f47144j0) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 != null) {
                        i10++;
                        v2.k a5 = lVar2.a();
                        a5.f47084a = Uri.parse(str2);
                        lVar2 = a5.a();
                        AbstractC5530A.g(jVar);
                    } else {
                        throw e10;
                    }
                }
            } catch (Exception e11) {
                Uri uri = d10.f47043c;
                uri.getClass();
                throw new G(lVar, uri, d10.f47041a.j(), d10.f47042b, e11);
            }
        }
    }

    public final boolean a(C5052e c5052e, C5065s c5065s) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(c5065s.f42319q0);
        int i10 = c5065s.f42297D0;
        if (equals && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(AbstractC5530A.p(i10));
        int i11 = c5065s.f42298E0;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = ((Spatializer) this.f1739b).canBeSpatialized((AudioAttributes) c5052e.b().f8729Y, channelMask.build());
        return canBeSpatialized;
    }

    public final void b(boolean z10) {
        i4.i iVar = (i4.i) this.f1741d;
        synchronized (iVar) {
            try {
                if (!this.f1738a) {
                    if (AbstractC3557B.K(((C3472e) this.f1739b).f32673g, this)) {
                        i4.i.a(iVar, this, z10);
                    }
                    this.f1738a = true;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(H2.p pVar, Looper looper) {
        if (((Spatializer$OnSpatializerStateChangedListener) this.f1741d) == null && ((Handler) this.f1740c) == null) {
            this.f1741d = new H2.k(pVar);
            Handler handler = new Handler(looper);
            this.f1740c = handler;
            ((Spatializer) this.f1739b).addOnSpatializerStateChangedListener(new O(1, handler), (Spatializer$OnSpatializerStateChangedListener) this.f1741d);
        }
    }

    public final byte[] d(UUID uuid, w wVar) {
        String str;
        String str2 = wVar.f1822b;
        if (this.f1738a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f1740c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = AbstractC5058k.f42088e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (AbstractC5058k.f42086c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put(SIPHeaderNames.CONTENT_TYPE, str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((Map) this.f1741d)) {
                hashMap.putAll((Map) this.f1741d);
            }
            return e((AbstractC5968g) this.f1739b, str2, wVar.f1821a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        Gi.e.p(uri, "The uri must be set.");
        throw new G(new v2.l(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), uri, p0.f49595l0, 0L, new IllegalStateException("No license URL"));
    }

    public final byte[] f(x xVar) {
        return e((AbstractC5968g) this.f1739b, xVar.f1824b + "&signedRequest=" + AbstractC5530A.m(xVar.f1823a), null, Collections.emptyMap());
    }

    public final C4113B g(int i10) {
        C4113B c4113b;
        i4.i iVar = (i4.i) this.f1741d;
        synchronized (iVar) {
            if (!this.f1738a) {
                ((boolean[]) this.f1740c)[i10] = true;
                Object obj = ((C3472e) this.f1739b).f32670d.get(i10);
                C3474g c3474g = iVar.f32697u0;
                C4113B c4113b2 = (C4113B) obj;
                if (!c3474g.f(c4113b2)) {
                    u4.e.a(c3474g.k(c4113b2));
                }
                c4113b = (C4113B) obj;
            } else {
                throw new IllegalStateException("editor is closed".toString());
            }
        }
        return c4113b;
    }

    public final void h(int i10, C4462g c4462g) {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f1740c;
            if (entry != null && ((C4469n) entry.getKey()).f38405Z < i10) {
                C4469n c4469n = (C4469n) ((Map.Entry) this.f1740c).getKey();
                int i11 = 0;
                if (this.f1738a && c4469n.f38406h0.f38355Y == EnumC4455M.f38365o0 && !c4469n.f38407i0) {
                    c4462g.x(1, 3);
                    c4462g.x(2, 0);
                    c4462g.v(c4469n.f38405Z);
                    c4462g.o(3, (AbstractC4456a) ((Map.Entry) this.f1740c).getValue());
                    c4462g.x(1, 4);
                } else {
                    Object value = ((Map.Entry) this.f1740c).getValue();
                    C4465j c4465j = C4465j.f38396d;
                    EnumC4454L enumC4454L = c4469n.f38406h0;
                    boolean z10 = c4469n.f38407i0;
                    int i12 = c4469n.f38405Z;
                    if (z10) {
                        List<Object> list = (List) value;
                        if (c4469n.f38408j0) {
                            c4462g.x(i12, 2);
                            for (Object obj : list) {
                                i11 += C4465j.c(enumC4454L, obj);
                            }
                            c4462g.v(i11);
                            for (Object obj2 : list) {
                                C4465j.l(c4462g, enumC4454L, obj2);
                            }
                        } else {
                            for (Object obj3 : list) {
                                C4465j.k(c4462g, enumC4454L, i12, obj3);
                            }
                        }
                    } else {
                        C4465j.k(c4462g, enumC4454L, i12, value);
                    }
                }
                Iterator it = (Iterator) this.f1739b;
                if (it.hasNext()) {
                    this.f1740c = (Map.Entry) it.next();
                } else {
                    this.f1740c = null;
                }
            } else {
                return;
            }
        }
    }

    public E(String str, boolean z10, v2.o oVar) {
        Gi.e.l(!z10 || !TextUtils.isEmpty(str));
        this.f1739b = oVar;
        this.f1740c = str;
        this.f1738a = z10;
        this.f1741d = new HashMap();
    }

    public E(AbstractC4468m abstractC4468m) {
        Iterator it;
        this.f1741d = abstractC4468m;
        C4465j c4465j = abstractC4468m.f38403Y;
        boolean z10 = c4465j.f38399c;
        C4444B c4444b = c4465j.f38397a;
        if (z10) {
            it = new androidx.datastore.preferences.protobuf.F(((C6054a) c4444b.entrySet()).iterator(), 3);
        } else {
            it = ((C6054a) c4444b.entrySet()).iterator();
        }
        this.f1739b = it;
        if (it.hasNext()) {
            this.f1740c = (Map.Entry) it.next();
        }
        this.f1738a = false;
    }

    public E(i4.i iVar, C3472e c3472e) {
        this.f1741d = iVar;
        this.f1739b = c3472e;
        iVar.getClass();
        this.f1740c = new boolean[2];
    }

    public E(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f1739b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f1738a = immersiveAudioLevel != 0;
    }
}
