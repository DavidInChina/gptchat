package B2;

import N.C1025i;
import android.gov.nist.core.Separators;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.text.TextUtils;
import c1.AbstractC2279d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.AbstractC5058k;
import p2.C5062o;
import s2.AbstractC5530A;
import x2.AbstractC6267b;
import z2.C6755D;

/* loaded from: classes2.dex */
public final class D implements y {

    /* renamed from: i0  reason: collision with root package name */
    public static final A f1734i0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final UUID f1735Y;

    /* renamed from: Z  reason: collision with root package name */
    public final MediaDrm f1736Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1737h0;

    public D(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        Gi.e.k("Use C.CLEARKEY_UUID instead", !AbstractC5058k.f42085b.equals(uuid));
        this.f1735Y = uuid;
        MediaDrm mediaDrm = new MediaDrm((AbstractC5530A.f45131a >= 27 || !AbstractC5058k.f42086c.equals(uuid)) ? uuid : uuid2);
        this.f1736Z = mediaDrm;
        this.f1737h0 = 1;
        if (AbstractC5058k.f42087d.equals(uuid) && "ASUS_Z00AD".equals(AbstractC5530A.f45134d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // B2.y
    public final Map b(byte[] bArr) {
        return this.f1736Z.queryKeyStatus(bArr);
    }

    @Override // B2.y
    public final void c(byte[] bArr, C6755D c6755d) {
        if (AbstractC5530A.f45131a >= 31) {
            try {
                C.b(this.f1736Z, bArr, c6755d);
            } catch (UnsupportedOperationException unused) {
                s2.p.g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // B2.y
    public final void d(final J0.a aVar) {
        this.f1736Z.setOnEventListener(new MediaDrm.OnEventListener() { // from class: B2.B
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                D d10 = D.this;
                J0.a aVar2 = aVar;
                d10.getClass();
                HandlerC0204e handlerC0204e = ((C0207h) aVar2.f8729Y).f1782C0;
                handlerC0204e.getClass();
                handlerC0204e.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // B2.y
    public final x e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f1736Z.getProvisionRequest();
        return new x(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // B2.y
    public final AbstractC6267b g(byte[] bArr) {
        boolean z10;
        int i10 = AbstractC5530A.f45131a;
        UUID uuid = this.f1735Y;
        if (i10 < 21 && AbstractC5058k.f42087d.equals(uuid) && "L3".equals(this.f1736Z.getPropertyString("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 < 27 && AbstractC5058k.f42086c.equals(uuid)) {
            uuid = AbstractC5058k.f42085b;
        }
        return new z(uuid, bArr, z10);
    }

    @Override // B2.y
    public final byte[] i() {
        return this.f1736Z.openSession();
    }

    @Override // B2.y
    public final void j(byte[] bArr, byte[] bArr2) {
        this.f1736Z.restoreKeys(bArr, bArr2);
    }

    @Override // B2.y
    public final void k(byte[] bArr) {
        this.f1736Z.closeSession(bArr);
    }

    @Override // B2.y
    public final byte[] m(byte[] bArr, byte[] bArr2) {
        if (AbstractC5058k.f42086c.equals(this.f1735Y) && AbstractC5530A.f45131a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC5530A.m(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(Separators.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(w8.e.f48221c);
            } catch (JSONException e10) {
                s2.p.d("ClearKeyUtil", "Failed to adjust response data: ".concat(AbstractC5530A.m(bArr2)), e10);
            }
        }
        return this.f1736Z.provideKeyResponse(bArr, bArr2);
    }

    @Override // B2.y
    public final void n(byte[] bArr) {
        this.f1736Z.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c7, code lost:
        if ("AFTT".equals(r7) == false) goto L84;
     */
    @Override // B2.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w o(byte[] bArr, List list, int i10, HashMap hashMap) {
        String str;
        byte[] bArr2;
        C5062o c5062o;
        int i11;
        int indexOf;
        int i12;
        UUID uuid = this.f1735Y;
        if (list != null) {
            if (!AbstractC5058k.f42087d.equals(uuid)) {
                c5062o = (C5062o) list.get(0);
            } else {
                if (AbstractC5530A.f45131a >= 28 && list.size() > 1) {
                    C5062o c5062o2 = (C5062o) list.get(0);
                    int i13 = 0;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        C5062o c5062o3 = (C5062o) list.get(i14);
                        byte[] bArr3 = c5062o3.f42210j0;
                        bArr3.getClass();
                        if (AbstractC5530A.a(c5062o3.f42209i0, c5062o2.f42209i0) && AbstractC5530A.a(c5062o3.f42208h0, c5062o2.f42208h0) && AbstractC2279d.t(bArr3) != null) {
                            i13 += bArr3.length;
                        }
                    }
                    byte[] bArr4 = new byte[i13];
                    int i15 = 0;
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        byte[] bArr5 = ((C5062o) list.get(i16)).f42210j0;
                        bArr5.getClass();
                        int length = bArr5.length;
                        System.arraycopy(bArr5, 0, bArr4, i15, length);
                        i15 += length;
                    }
                    c5062o = new C5062o(c5062o2.f42207Z, c5062o2.f42208h0, c5062o2.f42209i0, bArr4);
                }
                for (int i17 = 0; i17 < list.size(); i17++) {
                    C5062o c5062o4 = (C5062o) list.get(i17);
                    byte[] bArr6 = c5062o4.f42210j0;
                    bArr6.getClass();
                    C1025i t10 = AbstractC2279d.t(bArr6);
                    if (t10 == null) {
                        i12 = -1;
                    } else {
                        i12 = t10.f12350Z;
                    }
                    int i18 = AbstractC5530A.f45131a;
                    if ((i18 < 23 && i12 == 0) || (i18 >= 23 && i12 == 1)) {
                        c5062o = c5062o4;
                        break;
                    }
                }
                c5062o = (C5062o) list.get(0);
            }
            byte[] bArr7 = c5062o.f42210j0;
            bArr7.getClass();
            UUID uuid2 = AbstractC5058k.f42088e;
            if (uuid2.equals(uuid)) {
                byte[] u10 = AbstractC2279d.u(uuid, bArr7);
                if (u10 != null) {
                    bArr7 = u10;
                }
                s2.u uVar = new s2.u(bArr7);
                int i19 = uVar.i();
                short k10 = uVar.k();
                short k11 = uVar.k();
                if (k10 == 1 && k11 == 1) {
                    short k12 = uVar.k();
                    Charset charset = w8.e.f48223e;
                    String s10 = uVar.s(k12, charset);
                    if (!s10.contains("<LA_URL>")) {
                        if (s10.indexOf("</DATA>") == -1) {
                            s2.p.g("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = s10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + s10.substring(indexOf);
                        int i20 = i19 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i20);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i20);
                        allocate.putShort(k10);
                        allocate.putShort(k11);
                        allocate.putShort((short) (str2.length() * 2));
                        allocate.put(str2.getBytes(charset));
                        bArr7 = allocate.array();
                    }
                } else {
                    s2.p.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                if (bArr7 != null) {
                    i11 = bArr7.length;
                } else {
                    i11 = 0;
                }
                int i21 = i11 + 32;
                ByteBuffer allocate2 = ByteBuffer.allocate(i21);
                allocate2.putInt(i21);
                allocate2.putInt(1886614376);
                allocate2.putInt(0);
                allocate2.putLong(uuid2.getMostSignificantBits());
                allocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArr7 != null && bArr7.length != 0) {
                    allocate2.putInt(bArr7.length);
                    allocate2.put(bArr7);
                }
                bArr7 = allocate2.array();
            }
            int i22 = AbstractC5530A.f45131a;
            if (i22 >= 23 || !AbstractC5058k.f42087d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(AbstractC5530A.f45133c)) {
                    String str3 = AbstractC5530A.f45134d;
                    if (!"AFTB".equals(str3)) {
                        if (!"AFTS".equals(str3)) {
                            if (!"AFTM".equals(str3)) {
                            }
                        }
                    }
                }
                str = c5062o.f42209i0;
                if (i22 < 26 && AbstractC5058k.f42086c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
                    str = "cenc";
                }
                bArr2 = bArr7;
            }
            byte[] u11 = AbstractC2279d.u(uuid, bArr7);
            if (u11 != null) {
                bArr7 = u11;
            }
            str = c5062o.f42209i0;
            if (i22 < 26) {
                str = "cenc";
            }
            bArr2 = bArr7;
        } else {
            c5062o = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f1736Z.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] data = keyRequest.getData();
        if (AbstractC5058k.f42086c.equals(uuid) && AbstractC5530A.f45131a < 27) {
            data = AbstractC5530A.m(data).replace('+', '-').replace('/', '_').getBytes(w8.e.f48221c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (AbstractC5530A.f45131a >= 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c5062o != null) {
            String str4 = c5062o.f42208h0;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (AbstractC5530A.f45131a >= 23) {
            keyRequest.getRequestType();
        }
        return new w(defaultUrl, data);
    }

    @Override // B2.y
    public final int q() {
        return 2;
    }

    @Override // B2.y
    public final boolean r(String str, byte[] bArr) {
        if (AbstractC5530A.f45131a >= 31) {
            return C.a(this.f1736Z, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f1735Y, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // B2.y
    public final synchronized void release() {
        int i10 = this.f1737h0 - 1;
        this.f1737h0 = i10;
        if (i10 == 0) {
            this.f1736Z.release();
        }
    }
}
