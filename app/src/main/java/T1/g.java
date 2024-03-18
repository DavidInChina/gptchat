package T1;

import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import r9.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: F  reason: collision with root package name */
    public static final d[][] f16855F;

    /* renamed from: L  reason: collision with root package name */
    public static final Charset f16861L;

    /* renamed from: M  reason: collision with root package name */
    public static final byte[] f16862M;

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f16863N;

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f16879a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f16880b;

    /* renamed from: c  reason: collision with root package name */
    public int f16881c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap[] f16882d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f16883e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f16884f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16885g;

    /* renamed from: h  reason: collision with root package name */
    public int f16886h;

    /* renamed from: i  reason: collision with root package name */
    public int f16887i;

    /* renamed from: j  reason: collision with root package name */
    public int f16888j;

    /* renamed from: k  reason: collision with root package name */
    public int f16889k;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f16864l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f16865m = {8, 8, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f16866n = {8};

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f16867o = {-1, -40, -1};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f16868p = {102, 116, 121, 112};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f16869q = {109, 105, 102, 49};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f16870r = {104, 101, 105, 99};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f16871s = {79, 76, 89, 77, 80, 0};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f16872t = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f16873u = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f16874v = {101, 88, 73, 102};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f16875w = {73, 72, 68, 82};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f16876x = {73, 69, 78, 68};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f16877y = {82, 73, 70, 70};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f16878z = {87, 69, 66, 80};

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f16850A = {69, 88, 73, 70};

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f16851B = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f16852C = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: D  reason: collision with root package name */
    public static final byte[] f16853D = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: E  reason: collision with root package name */
    public static final d f16854E = new d("StripOffsets", 273, 3);

    /* renamed from: G  reason: collision with root package name */
    public static final d[] f16856G = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: H  reason: collision with root package name */
    public static final HashMap[] f16857H = new HashMap[10];

    /* renamed from: I  reason: collision with root package name */
    public static final HashMap[] f16858I = new HashMap[10];

    /* renamed from: J  reason: collision with root package name */
    public static final HashSet f16859J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: K  reason: collision with root package name */
    public static final HashMap f16860K = new HashMap();

    static {
        d[] dVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f16855F = new d[][]{dVarArr2, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)}, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        f16861L = forName;
        f16862M = "Exif\u0000\u0000".getBytes(forName);
        f16863N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr3 = f16855F;
            if (i10 < dVarArr3.length) {
                f16857H[i10] = new HashMap();
                f16858I[i10] = new HashMap();
                for (d dVar : dVarArr3[i10]) {
                    f16857H[i10].put(Integer.valueOf(dVar.f16844a), dVar);
                    f16858I[i10].put(dVar.f16845b, dVar);
                }
                i10++;
            } else {
                HashMap hashMap = f16860K;
                d[] dVarArr4 = f16856G;
                hashMap.put(Integer.valueOf(dVarArr4[0].f16844a), 5);
                hashMap.put(Integer.valueOf(dVarArr4[1].f16844a), 1);
                hashMap.put(Integer.valueOf(dVarArr4[2].f16844a), 2);
                hashMap.put(Integer.valueOf(dVarArr4[3].f16844a), 3);
                hashMap.put(Integer.valueOf(dVarArr4[4].f16844a), 7);
                hashMap.put(Integer.valueOf(dVarArr4[5].f16844a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:39:0x00a5, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:61:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(InputStream inputStream) {
        Throwable e10;
        d[][] dVarArr = f16855F;
        this.f16882d = new HashMap[dVarArr.length];
        this.f16883e = new HashSet(dVarArr.length);
        boolean z10 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z11 = f16864l;
        if (z10) {
            this.f16880b = (AssetManager.AssetInputStream) inputStream;
            this.f16879a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f16880b = null;
                    this.f16879a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z11) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f16880b = null;
            this.f16879a = null;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f16882d[i10] = new HashMap();
                } catch (Throwable th2) {
                    a();
                    if (z11) {
                        r();
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e10 = e11;
                if (z11) {
                    AbstractC3612c.s("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z11) {
                    return;
                }
                r();
            } catch (UnsupportedOperationException e12) {
                e10 = e12;
                if (z11) {
                }
                a();
                if (!z11) {
                }
                r();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int g10 = g(bufferedInputStream);
        this.f16881c = g10;
        if (g10 != 4 && g10 != 9 && g10 != 13 && g10 != 14) {
            f fVar = new f(bufferedInputStream);
            int i11 = this.f16881c;
            if (i11 == 12) {
                e(fVar);
            } else if (i11 == 7) {
                h(fVar);
            } else if (i11 == 10) {
                m(fVar);
            } else {
                k(fVar);
            }
            fVar.h(this.f16886h);
            w(fVar);
            a();
            if (!z11) {
                return;
            }
            r();
        }
        b bVar = new b(bufferedInputStream);
        int i12 = this.f16881c;
        if (i12 == 4) {
            f(bVar, 0, 0);
        } else if (i12 == 13) {
            i(bVar);
        } else if (i12 == 9) {
            j(bVar);
        } else if (i12 == 14) {
            n(bVar);
        }
        a();
        if (!z11) {
        }
        r();
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f16864l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f16882d;
        if (b10 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b10.concat("\u0000").getBytes(f16861L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f16884f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f16884f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f16884f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f16884f));
        }
    }

    public final String b(String str) {
        c d10 = d(str);
        if (d10 != null) {
            if (!f16859J.contains(str)) {
                return d10.f(this.f16884f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = d10.f16840a;
                if (i10 != 5 && i10 != 10) {
                    AbstractC3612c.r("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) d10.g(this.f16884f);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) eVar.f16848a) / ((float) eVar.f16849b)));
                    e eVar2 = eVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f16848a) / ((float) eVar2.f16849b)));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f16848a) / ((float) eVar3.f16849b))));
                }
                AbstractC3612c.r("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(d10.d(this.f16884f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        c d10 = d("Orientation");
        if (d10 == null) {
            return 1;
        }
        try {
            return d10.e(this.f16884f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f16864l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f16855F.length; i10++) {
            c cVar = (c) this.f16882d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) {
        String str;
        String str2;
        String str3;
        int i10;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if (AuthorizationHeaderIms.YES.equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str = mediaMetadataRetriever.extractMetadata(31);
                    } else if (AuthorizationHeaderIms.YES.equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str3 = null;
                        str2 = null;
                        str = null;
                    }
                    HashMap[] hashMapArr = this.f16882d;
                    if (str3 != null) {
                        hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str3), this.f16884f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f16884f));
                    }
                    if (str != null) {
                        int parseInt = Integer.parseInt(str);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.c(i10, this.f16884f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.h(parseInt2);
                            byte[] bArr = new byte[6];
                            fVar.readFully(bArr);
                            int i11 = parseInt2 + 6;
                            int i12 = parseInt3 - 6;
                            if (Arrays.equals(bArr, f16862M)) {
                                byte[] bArr2 = new byte[i12];
                                fVar.readFully(bArr2);
                                this.f16886h = i11;
                                t(0, bArr2);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f16864l) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th2) {
                mediaMetadataRetriever.release();
                throw th2;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[LOOP:0: B:10:0x0034->B:71:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(b bVar, int i10, int i11) {
        byte readByte;
        byte readByte2;
        String str;
        String str2;
        boolean z10 = f16864l;
        if (z10) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f16837h0 = ByteOrder.BIG_ENDIAN;
        byte b10 = -1;
        if (bVar.readByte() == -1) {
            if (bVar.readByte() == -40) {
                int i12 = 2;
                int i13 = 2;
                while (true) {
                    if (bVar.readByte() == b10) {
                        byte readByte3 = bVar.readByte();
                        if (z10) {
                            Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                        }
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = bVar.readUnsignedShort();
                            int i14 = readUnsignedShort - 2;
                            int i15 = i13 + 4;
                            if (z10) {
                                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + Separators.RPAREN);
                            }
                            if (i14 >= 0) {
                                HashMap[] hashMapArr = this.f16882d;
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                bVar.a(1);
                                                                HashMap hashMap = hashMapArr[i11];
                                                                if (i11 != 4) {
                                                                    str = "ImageLength";
                                                                } else {
                                                                    str = "ThumbnailImageLength";
                                                                }
                                                                hashMap.put(str, c.a(bVar.readUnsignedShort(), this.f16884f));
                                                                HashMap hashMap2 = hashMapArr[i11];
                                                                if (i11 != 4) {
                                                                    str2 = "ImageWidth";
                                                                } else {
                                                                    str2 = "ThumbnailImageWidth";
                                                                }
                                                                hashMap2.put(str2, c.a(bVar.readUnsignedShort(), this.f16884f));
                                                                i14 = readUnsignedShort - 7;
                                                                break;
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                        if (i14 < 0) {
                                            bVar.a(i14);
                                            i13 = i15 + i14;
                                            i12 = 2;
                                            b10 = -1;
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    } else {
                                        byte[] bArr = new byte[i14];
                                        bVar.readFully(bArr);
                                        if (b("UserComment") == null) {
                                            HashMap hashMap3 = hashMapArr[1];
                                            Charset charset = f16861L;
                                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                            hashMap3.put("UserComment", new c(bytes, i12, bytes.length));
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[i14];
                                    bVar.readFully(bArr2);
                                    int i16 = i15 + i14;
                                    byte[] bArr3 = f16862M;
                                    if (bArr3 != null && i14 >= bArr3.length) {
                                        for (int i17 = 0; i17 < bArr3.length; i17++) {
                                            if (bArr2[i17] == bArr3[i17]) {
                                            }
                                        }
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i14);
                                        this.f16886h = i10 + i15 + bArr3.length;
                                        t(i11, copyOfRange);
                                        w(new b(copyOfRange));
                                        i15 = i16;
                                    }
                                    byte[] bArr4 = f16863N;
                                    if (bArr4 != null && i14 >= bArr4.length) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 < bArr4.length) {
                                                if (bArr2[i18] == bArr4[i18]) {
                                                    i18++;
                                                }
                                            } else {
                                                int length = i15 + bArr4.length;
                                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i14);
                                                if (b("Xmp") == null) {
                                                    hashMapArr[0].put("Xmp", new c(length, copyOfRange2, 1, copyOfRange2.length));
                                                }
                                            }
                                        }
                                    }
                                    i15 = i16;
                                }
                                i14 = 0;
                                if (i14 < 0) {
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
                bVar.f16837h0 = this.f16884f;
                return;
            }
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bb, code lost:
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        InputStream inputStream;
        Throwable th2;
        int i10;
        byte[] bArr;
        b bVar;
        b bVar2;
        Throwable th3;
        b bVar3;
        boolean z10;
        b bVar4;
        b bVar5;
        Throwable th4;
        boolean z11;
        b bVar6;
        Exception e10;
        long j6;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f16867o;
            if (i11 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i11] != bArr3[i11]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    byte b10 = bArr2[i12];
                    ?? r82 = bytes[i12];
                    try {
                        if (b10 != r82) {
                            try {
                                bVar6 = new b(bArr2);
                                try {
                                    long readInt = bVar6.readInt();
                                    byte[] bArr4 = new byte[4];
                                    bVar6.readFully(bArr4);
                                    if (Arrays.equals(bArr4, f16868p)) {
                                        if (readInt == 1) {
                                            readInt = bVar6.readLong();
                                            j6 = 16;
                                            if (readInt < 16) {
                                            }
                                        } else {
                                            j6 = 8;
                                        }
                                        long j10 = 5000;
                                        if (readInt > j10) {
                                            readInt = j10;
                                        }
                                        long j11 = readInt - j6;
                                        if (j11 >= 8) {
                                            byte[] bArr5 = new byte[4];
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            for (long j12 = 0; j12 < j11 / 4; j12++) {
                                                try {
                                                    bVar6.readFully(bArr5);
                                                    if (j12 != 1) {
                                                        if (Arrays.equals(bArr5, f16869q)) {
                                                            z12 = true;
                                                        } else if (Arrays.equals(bArr5, f16870r)) {
                                                            z13 = true;
                                                        }
                                                        if (z12 && z13) {
                                                            bVar6.close();
                                                            return 12;
                                                        }
                                                    }
                                                } catch (EOFException unused) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    e10 = e11;
                                    if (f16864l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e10);
                                    }
                                }
                            } catch (Exception e12) {
                                e10 = e12;
                                bVar6 = null;
                            } catch (Throwable th5) {
                                th2 = th5;
                                inputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th2;
                            }
                            bVar6.close();
                            try {
                                bVar4 = new b(bArr2);
                                try {
                                    ByteOrder s10 = s(bVar4);
                                    this.f16884f = s10;
                                    bVar4.f16837h0 = s10;
                                    short readShort = bVar4.readShort();
                                    if (readShort != 20306 && readShort != 21330) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    bVar4.close();
                                    if (z11) {
                                        return 7;
                                    }
                                } catch (Exception unused2) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    bVar3 = new b(bArr2);
                                    ByteOrder s11 = s(bVar3);
                                    this.f16884f = s11;
                                    bVar3.f16837h0 = s11;
                                    if (bVar3.readShort() != 85) {
                                    }
                                    bVar3.close();
                                    if (z10) {
                                    }
                                    i10 = 0;
                                    while (true) {
                                        bArr = f16873u;
                                        if (i10 < bArr.length) {
                                        }
                                        i10++;
                                    }
                                } catch (Throwable th6) {
                                    th4 = th6;
                                    bVar5 = bVar4;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th4;
                                }
                            } catch (Exception unused3) {
                                bVar4 = null;
                            } catch (Throwable th7) {
                                th4 = th7;
                                bVar5 = null;
                            }
                            try {
                                bVar3 = new b(bArr2);
                            } catch (Exception unused4) {
                                bVar = null;
                            } catch (Throwable th8) {
                                th3 = th8;
                                bVar2 = null;
                            }
                            try {
                                ByteOrder s112 = s(bVar3);
                                this.f16884f = s112;
                                bVar3.f16837h0 = s112;
                                if (bVar3.readShort() != 85) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bVar3.close();
                                if (z10) {
                                    return 10;
                                }
                            } catch (Exception unused5) {
                                bVar = bVar3;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                i10 = 0;
                                while (true) {
                                    bArr = f16873u;
                                    if (i10 < bArr.length) {
                                    }
                                    i10++;
                                }
                            } catch (Throwable th9) {
                                th3 = th9;
                                bVar2 = bVar3;
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                throw th3;
                            }
                            i10 = 0;
                            while (true) {
                                bArr = f16873u;
                                if (i10 < bArr.length) {
                                    if (bArr2[i10] != bArr[i10]) {
                                        int i13 = 0;
                                        while (true) {
                                            byte[] bArr6 = f16877y;
                                            if (i13 < bArr6.length) {
                                                if (bArr2[i13] != bArr6[i13]) {
                                                    break;
                                                }
                                                i13++;
                                            } else {
                                                int i14 = 0;
                                                while (true) {
                                                    byte[] bArr7 = f16878z;
                                                    if (i14 < bArr7.length) {
                                                        if (bArr2[bArr6.length + i14 + 4] != bArr7[i14]) {
                                                            break;
                                                        }
                                                        i14++;
                                                    } else {
                                                        return 14;
                                                    }
                                                }
                                            }
                                        }
                                        return 0;
                                    }
                                    i10++;
                                } else {
                                    return 13;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                        inputStream = r82;
                    }
                }
                return 9;
            }
            i11++;
        }
    }

    public final void h(f fVar) {
        int i10;
        int i11;
        k(fVar);
        HashMap[] hashMapArr = this.f16882d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f16843d);
            fVar2.f16837h0 = this.f16884f;
            byte[] bArr = f16871s;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0L);
            byte[] bArr3 = f16872t;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f16884f);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c c10 = c.c(i14, this.f16884f);
                        c c11 = c.c(i15, this.f16884f);
                        hashMapArr[0].put("ImageWidth", c10);
                        hashMapArr[0].put("ImageLength", c11);
                        return;
                    }
                    return;
                }
                AbstractC3612c.r("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(b bVar) {
        if (f16864l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f16837h0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f16873u;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f16875w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (!Arrays.equals(bArr2, f16876x)) {
                    if (Arrays.equals(bArr2, f16874v)) {
                        byte[] bArr3 = new byte[readInt];
                        bVar.readFully(bArr3);
                        int readInt2 = bVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f16886h = i10;
                            t(0, bArr3);
                            z();
                            w(new b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i11 = readInt + 4;
                    bVar.a(i11);
                    length = i10 + i11;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) {
        boolean z10 = f16864l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f16836Z);
        bVar.readFully(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f16836Z);
        bVar.f16837h0 = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f16854E.f16844a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c10 = c.c(readShort, this.f16884f);
                c c11 = c.c(readShort2, this.f16884f);
                HashMap[] hashMapArr = this.f16882d;
                hashMapArr[0].put("ImageLength", c10);
                hashMapArr[0].put("ImageWidth", c11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.f16881c == 8) {
            HashMap[] hashMapArr = this.f16882d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f16843d);
                fVar2.f16837h0 = this.f16884f;
                fVar2.a(6);
                u(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final int l() {
        switch (c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(f fVar) {
        if (f16864l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap[] hashMapArr = this.f16882d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f16843d), (int) cVar.f16842c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void n(b bVar) {
        if (f16864l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f16837h0 = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f16877y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f16878z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f16850A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f16886h = i10;
                    t(0, bArr3);
                    w(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    bVar.a(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f16884f);
            int e11 = cVar2.e(this.f16884f);
            if (this.f16881c == 7) {
                e10 += this.f16887i;
            }
            if (e10 > 0 && e11 > 0 && this.f16880b == null && this.f16879a == null) {
                bVar.a(e10);
                bVar.readFully(new byte[e11]);
            }
            if (f16864l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e10 + ", length: " + e11);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f16884f);
            int e11 = cVar2.e(this.f16884f);
            if (e10 <= 512 && e11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(b bVar) {
        ByteOrder s10 = s(bVar);
        this.f16884f = s10;
        bVar.f16837h0 = s10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f16881c;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i11 = readInt - 8;
            if (i11 > 0) {
                bVar.a(i11);
                return;
            }
            return;
        }
        throw new IOException(android.gov.nist.core.a.e("Invalid first Ifd offset: ", readInt));
    }

    public final void r() {
        int i10 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f16882d;
            if (i10 < hashMapArr.length) {
                StringBuilder q10 = android.gov.nist.core.a.q("The size of tag group[", i10, "]: ");
                q10.append(hashMapArr[i10].size());
                Log.d("ExifInterface", q10.toString());
                for (Map.Entry entry : hashMapArr[i10].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f16884f) + Separators.QUOTE);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void t(int i10, byte[] bArr) {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(f fVar, int i10) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        short s10;
        long j6;
        int i11;
        boolean z10;
        d dVar;
        long j10;
        long j11;
        String str;
        long j12;
        long j13;
        int i12;
        HashSet hashSet2;
        int readUnsignedShort;
        int[] iArr;
        int i13;
        String str2;
        int i14 = i10;
        Integer valueOf = Integer.valueOf(fVar.f16836Z);
        HashSet hashSet3 = this.f16883e;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z11 = f16864l;
        String str3 = "ExifInterface";
        if (z11) {
            Log.d(str3, "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            hashMapArr = this.f16882d;
            if (s11 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            short s12 = readShort;
            long j14 = fVar.f16836Z + 4;
            d dVar2 = (d) f16857H[i14].get(Integer.valueOf(readUnsignedShort2));
            if (z11) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(readUnsignedShort2);
                if (dVar2 != null) {
                    str2 = dVar2.f16845b;
                } else {
                    str2 = null;
                }
                objArr[2] = str2;
                objArr[3] = Integer.valueOf(readUnsignedShort3);
                objArr[4] = Integer.valueOf(readInt);
                Log.d(str3, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (dVar2 == null) {
                if (z11) {
                    Log.d(str3, "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
                hashSet = hashSet3;
                s10 = s11;
            } else {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f16852C.length) {
                        int i15 = dVar2.f16846c;
                        s10 = s11;
                        if (i15 == 7 || readUnsignedShort3 == 7 || i15 == readUnsignedShort3 || (i13 = dVar2.f16847d) == readUnsignedShort3) {
                            hashSet = hashSet3;
                        } else {
                            hashSet = hashSet3;
                            if (((i15 != 4 && i13 != 4) || readUnsignedShort3 != 3) && (((i15 != 9 && i13 != 9) || readUnsignedShort3 != 8) && ((i15 != 12 && i13 != 12) || readUnsignedShort3 != 11))) {
                                if (z11) {
                                    Log.d(str3, "Skip the tag entry since data format (" + f16851B[readUnsignedShort3] + ") is unexpected for tag: " + dVar2.f16845b);
                                }
                            }
                        }
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i15;
                        }
                        i11 = readUnsignedShort2;
                        int i16 = readUnsignedShort3;
                        j6 = readInt * iArr[readUnsignedShort3];
                        if (j6 >= 0 && j6 <= 2147483647L) {
                            readUnsignedShort3 = i16;
                            z10 = true;
                        } else {
                            if (z11) {
                                Log.d(str3, "Skip the tag entry since the number of components is invalid: " + readInt);
                            }
                            readUnsignedShort3 = i16;
                            z10 = false;
                        }
                        if (!z10) {
                            fVar.h(j14);
                            str = str3;
                        } else {
                            if (j6 > 4) {
                                int readInt2 = fVar.readInt();
                                j10 = j14;
                                if (z11) {
                                    Log.d(str3, "seek to data offset: " + readInt2);
                                }
                                if (this.f16881c == 7) {
                                    if ("MakerNote".equals(dVar2.f16845b)) {
                                        this.f16887i = readInt2;
                                    } else if (i14 == 6 && "ThumbnailImage".equals(dVar2.f16845b)) {
                                        this.f16888j = readInt2;
                                        this.f16889k = readInt;
                                        c c10 = c.c(6, this.f16884f);
                                        dVar = dVar2;
                                        c a5 = c.a(this.f16888j, this.f16884f);
                                        str = str3;
                                        j11 = j6;
                                        c a10 = c.a(this.f16889k, this.f16884f);
                                        hashMapArr[4].put("Compression", c10);
                                        hashMapArr[4].put("JPEGInterchangeFormat", a5);
                                        hashMapArr[4].put("JPEGInterchangeFormatLength", a10);
                                        fVar.h(readInt2);
                                    }
                                }
                                dVar = dVar2;
                                str = str3;
                                j11 = j6;
                                fVar.h(readInt2);
                            } else {
                                dVar = dVar2;
                                j10 = j14;
                                str = str3;
                                j11 = j6;
                            }
                            Integer num = (Integer) f16860K.get(Integer.valueOf(i11));
                            if (z11) {
                                StringBuilder sb2 = new StringBuilder("nextIfdType: ");
                                sb2.append(num);
                                sb2.append(" byteCount: ");
                                j12 = j11;
                                sb2.append(j12);
                                Log.d(str, sb2.toString());
                            } else {
                                j12 = j11;
                            }
                            if (num != null) {
                                if (readUnsignedShort3 != 3) {
                                    if (readUnsignedShort3 != 4) {
                                        if (readUnsignedShort3 != 8) {
                                            if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                j13 = -1;
                                            } else {
                                                readUnsignedShort = fVar.readInt();
                                            }
                                        } else {
                                            readUnsignedShort = fVar.readShort();
                                        }
                                    } else {
                                        j13 = fVar.readInt() & 4294967295L;
                                    }
                                    if (!z11) {
                                        Log.d(str, String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16845b));
                                    }
                                    i12 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                    int i17 = fVar.f16839j0;
                                    if (i12 > 0 || (i17 != -1 && j13 >= i17)) {
                                        hashSet2 = hashSet;
                                        if (z11) {
                                            String f6 = android.gov.nist.core.a.f("Skip jump into the IFD since its offset is invalid: ", j13);
                                            if (i17 != -1) {
                                                f6 = f6 + " (total length: " + i17 + Separators.RPAREN;
                                            }
                                            Log.d(str, f6);
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        if (!hashSet2.contains(Integer.valueOf((int) j13))) {
                                            fVar.h(j13);
                                            u(fVar, num.intValue());
                                        } else if (z11) {
                                            Log.d(str, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + Separators.RPAREN);
                                        }
                                    }
                                    fVar.h(j10);
                                    hashSet = hashSet2;
                                } else {
                                    readUnsignedShort = fVar.readUnsignedShort();
                                }
                                j13 = readUnsignedShort;
                                if (!z11) {
                                }
                                i12 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                int i172 = fVar.f16839j0;
                                if (i12 > 0) {
                                }
                                hashSet2 = hashSet;
                                if (z11) {
                                }
                                fVar.h(j10);
                                hashSet = hashSet2;
                            } else {
                                long j15 = j10;
                                d dVar3 = dVar;
                                int i18 = fVar.f16836Z + this.f16886h;
                                byte[] bArr = new byte[(int) j12];
                                fVar.readFully(bArr);
                                hashSet = hashSet;
                                c cVar = new c(i18, bArr, readUnsignedShort3, readInt);
                                hashMapArr[i10].put(dVar3.f16845b, cVar);
                                String str4 = dVar3.f16845b;
                                if ("DNGVersion".equals(str4)) {
                                    this.f16881c = 3;
                                }
                                if ((("Make".equals(str4) || "Model".equals(str4)) && cVar.f(this.f16884f).contains("PENTAX")) || ("Compression".equals(str4) && cVar.e(this.f16884f) == 65535)) {
                                    this.f16881c = 8;
                                }
                                if (fVar.f16836Z != j15) {
                                    fVar.h(j15);
                                }
                            }
                        }
                        s11 = (short) (s10 + 1);
                        i14 = i10;
                        str3 = str;
                        readShort = s12;
                        hashSet3 = hashSet;
                    }
                }
                hashSet = hashSet3;
                s10 = s11;
                i11 = readUnsignedShort2;
                if (z11) {
                    Log.d(str3, "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                z10 = false;
                j6 = 0;
                if (!z10) {
                }
                s11 = (short) (s10 + 1);
                i14 = i10;
                str3 = str;
                readShort = s12;
                hashSet3 = hashSet;
            }
            i11 = readUnsignedShort2;
            z10 = false;
            j6 = 0;
            if (!z10) {
            }
            s11 = (short) (s10 + 1);
            i14 = i10;
            str3 = str;
            readShort = s12;
            hashSet3 = hashSet;
        }
        HashSet hashSet4 = hashSet3;
        String str5 = str3;
        int readInt3 = fVar.readInt();
        if (z11) {
            Log.d(str5, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j16 = readInt3;
        if (j16 > 0) {
            if (!hashSet4.contains(Integer.valueOf(readInt3))) {
                fVar.h(j16);
                if (hashMapArr[4].isEmpty()) {
                    u(fVar, 4);
                } else if (hashMapArr[5].isEmpty()) {
                    u(fVar, 5);
                }
            } else if (z11) {
                Log.d(str5, "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
            }
        } else if (z11) {
            Log.d(str5, "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
        }
    }

    public final void v(int i10, String str, String str2) {
        HashMap[] hashMapArr = this.f16882d;
        if (!hashMapArr[i10].isEmpty() && hashMapArr[i10].get(str) != null) {
            HashMap hashMap = hashMapArr[i10];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i10].remove(str);
        }
    }

    public final void w(b bVar) {
        c cVar;
        int e10;
        HashMap hashMap = this.f16882d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int e11 = cVar2.e(this.f16884f);
            if (e11 != 1) {
                if (e11 != 6) {
                    if (e11 != 7) {
                        return;
                    }
                } else {
                    o(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.g(this.f16884f);
                int[] iArr2 = f16865m;
                if (Arrays.equals(iArr2, iArr) || (this.f16881c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e10 = cVar.e(this.f16884f)) == 1 && Arrays.equals(iArr, f16866n)) || (e10 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] c02 = y.c0(cVar4.g(this.f16884f));
                        long[] c03 = y.c0(cVar5.g(this.f16884f));
                        if (c02 != null && c02.length != 0) {
                            if (c03 != null && c03.length != 0) {
                                if (c02.length != c03.length) {
                                    AbstractC3612c.r("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j6 = 0;
                                for (long j10 : c03) {
                                    j6 += j10;
                                }
                                byte[] bArr = new byte[(int) j6];
                                this.f16885g = true;
                                int i10 = 0;
                                int i11 = 0;
                                for (int i12 = 0; i12 < c02.length; i12++) {
                                    int i13 = (int) c02[i12];
                                    int i14 = (int) c03[i12];
                                    if (i12 < c02.length - 1 && i13 + i14 != c02[i12 + 1]) {
                                        this.f16885g = false;
                                    }
                                    int i15 = i13 - i10;
                                    if (i15 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        bVar.a(i15);
                                        int i16 = i10 + i15;
                                        byte[] bArr2 = new byte[i14];
                                        try {
                                            bVar.readFully(bArr2);
                                            i10 = i16 + i14;
                                            System.arraycopy(bArr2, 0, bArr, i11, i14);
                                            i11 += i14;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.f16885g) {
                                    long j11 = c02[0];
                                    return;
                                }
                                return;
                            }
                            AbstractC3612c.r("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        AbstractC3612c.r("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f16864l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        o(bVar, hashMap);
    }

    public final void x(int i10, int i11) {
        HashMap[] hashMapArr = this.f16882d;
        boolean isEmpty = hashMapArr[i10].isEmpty();
        boolean z10 = f16864l;
        if (!isEmpty && !hashMapArr[i11].isEmpty()) {
            c cVar = (c) hashMapArr[i10].get("ImageLength");
            c cVar2 = (c) hashMapArr[i10].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i11].get("ImageLength");
            c cVar4 = (c) hashMapArr[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int e10 = cVar.e(this.f16884f);
                    int e11 = cVar2.e(this.f16884f);
                    int e12 = cVar3.e(this.f16884f);
                    int e13 = cVar4.e(this.f16884f);
                    if (e10 < e12 && e11 < e13) {
                        HashMap hashMap = hashMapArr[i10];
                        hashMapArr[i10] = hashMapArr[i11];
                        hashMapArr[i11] = hashMap;
                    }
                } else if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void y(f fVar, int i10) {
        c cVar;
        c cVar2;
        HashMap[] hashMapArr = this.f16882d;
        c cVar3 = (c) hashMapArr[i10].get("DefaultCropSize");
        c cVar4 = (c) hashMapArr[i10].get("SensorTopBorder");
        c cVar5 = (c) hashMapArr[i10].get("SensorLeftBorder");
        c cVar6 = (c) hashMapArr[i10].get("SensorBottomBorder");
        c cVar7 = (c) hashMapArr[i10].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f16840a == 5) {
                e[] eVarArr = (e[]) cVar3.g(this.f16884f);
                if (eVarArr != null && eVarArr.length == 2) {
                    cVar2 = c.b(eVarArr[0], this.f16884f);
                    cVar = c.b(eVarArr[1], this.f16884f);
                } else {
                    AbstractC3612c.r("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar3.g(this.f16884f);
                if (iArr != null && iArr.length == 2) {
                    cVar2 = c.c(iArr[0], this.f16884f);
                    cVar = c.c(iArr[1], this.f16884f);
                } else {
                    AbstractC3612c.r("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i10].put("ImageWidth", cVar2);
            hashMapArr[i10].put("ImageLength", cVar);
        } else if (cVar4 != null && cVar5 != null && cVar6 != null && cVar7 != null) {
            int e10 = cVar4.e(this.f16884f);
            int e11 = cVar6.e(this.f16884f);
            int e12 = cVar7.e(this.f16884f);
            int e13 = cVar5.e(this.f16884f);
            if (e11 > e10 && e12 > e13) {
                c c10 = c.c(e11 - e10, this.f16884f);
                c c11 = c.c(e12 - e13, this.f16884f);
                hashMapArr[i10].put("ImageLength", c10);
                hashMapArr[i10].put("ImageWidth", c11);
            }
        } else {
            c cVar8 = (c) hashMapArr[i10].get("ImageLength");
            c cVar9 = (c) hashMapArr[i10].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = (c) hashMapArr[i10].get("JPEGInterchangeFormat");
                c cVar11 = (c) hashMapArr[i10].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int e14 = cVar10.e(this.f16884f);
                    int e15 = cVar10.e(this.f16884f);
                    fVar.h(e14);
                    byte[] bArr = new byte[e15];
                    fVar.readFully(bArr);
                    f(new b(bArr), e14, i10);
                }
            }
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f16882d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v(0, "ThumbnailOrientation", "Orientation");
        v(0, "ThumbnailImageLength", "ImageLength");
        v(0, "ThumbnailImageWidth", "ImageWidth");
        v(5, "ThumbnailOrientation", "Orientation");
        v(5, "ThumbnailImageLength", "ImageLength");
        v(5, "ThumbnailImageWidth", "ImageWidth");
        v(4, "Orientation", "ThumbnailOrientation");
        v(4, "ImageLength", "ThumbnailImageLength");
        v(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
